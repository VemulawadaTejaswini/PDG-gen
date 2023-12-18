import java.awt.geom.Point2D;
import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	Scanner sc = new Scanner(System.in);
	public static void main(String[] args){
		new Main();
	}
	public Main(){
//		new A().doIt();
		new GRL_6().doIt();
	}
	class GRL_6{
		void doIt(){
			int n = sc.nextInt();
			int e = sc.nextInt();
			SCC m = new SCC(n);
			for(int i = 0;i < e;i++){
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				m.addEdge(n1, n2);
			}
			int num = m.scc(n);
			int e2 = sc.nextInt();
//			System.out.println(num);
			for(int i = 0;i < e2;i++){
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();
				if(m.cmp[n1] == m.cmp[n2])System.out.println("1");
				else System.out.println("0");
			}
		}
		class SCC{
			int n;
			ArrayList<ArrayList<Integer>> g, rg;
			ArrayList<Integer> vs;
			boolean [] used;
			int [] cmp;
			
			SCC(int n){
				this.n = n;
				g = new ArrayList<ArrayList<Integer>>();
				rg = new ArrayList<ArrayList<Integer>>();
				for(int i=0;i<n;i++){
					g.add(new ArrayList<Integer>());
					rg.add(new ArrayList<Integer>());
				}
				vs = new ArrayList<Integer>();
				used = new boolean[n];
				cmp = new int[n];
			}
			
			private void addEdge(int from, int to){
				g.get(from).add(to);
				rg.get(to).add(from);
			}
			private void dfs(int v){
				used[v] = true;
				for(int i = 0; i < g.get(v).size(); i++){
					if(! used[g.get(v).get(i)]) dfs(g.get(v).get(i));
				}
				vs.add(v);
			}
			
			private void rdfs(int v , int k){
				used[v] = true;
				cmp[v] = k;
				for(int i = 0; i < rg.get(v).size(); i++){
					if(! used[rg.get(v).get(i)]) rdfs(rg.get(v).get(i), k);
				}
			}
			
			private int scc(int n){
				Arrays.fill(used, false);
				for(int v=0;v<n;v++){
					if(! used[v] ) dfs(v);
				}
				Arrays.fill(used, false);
				int k=0;
				for(int i = vs.size() - 1; i >= 0; i--){
					if(!used[vs.get(i)]) rdfs(vs.get(i), k++);
				}
//				System.out.println(Arrays.toString(cmp));
				return k;
			}
		}
	}
	class A{
		BigInteger sum[] = new BigInteger[501];
		BigInteger bit[] = new BigInteger[501];
		void doIt(){
			sum[1] = new BigInteger("1");
			bit[1] = new BigInteger("1");
			for(int i = 2;i < 501;i++){
				bit[i] = bit[i-1].multiply(new BigInteger("2"));
				sum[i] = sum[i-1].add(bit[i]);
			}
			while(true){
				String str = sc.next();
				if(str.equals("0"))break;
				BigInteger num = new BigInteger(str);
				int length = num.toString(2).length() + 1;
				ArrayList<Par> array = new ArrayList<Par>(); 
				array.add(new Par(bit[length],1,length-1));
				System.out.println(bit[length - 1]+" "+sum[length - 1]);
				System.out.println(array.get(0).num+" "+array.get(0).cnt+" "+array.get(0).length);
			}
		}
		class Par{
			BigInteger num;
			int cnt,length;
			public Par(BigInteger num,int cnt,int length){
				this.num = num;
				this.cnt = cnt;
				this.length = length;
			}
		}
	}
}