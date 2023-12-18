import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

//String With Rings
public class Main{

	List<Integer>[] e;
	int res;
	boolean[] v;
	
	void dfs(int k, int d){
		res = Math.max(res, d);
		for(int x:e[k])if(!v[x]){
			v[x] = true;
			dfs(x, d+1);
			v[x] = false;
		}
	}
	
	@SuppressWarnings("unchecked")
	void run(){
		Scanner sc = new Scanner(System.in);
//		sc.nextInt();
//		long T = System.currentTimeMillis();
		Random rand = new Random(1334259345907L);
//		System.out.println(T);
		for(;;){
			int n = sc.nextInt();
			if(n==0)break;
			e = new List[101];
			for(int i=1;i<101;i++)e[i]=new ArrayList<Integer>();
			boolean[] u = new boolean[101];
			while(n--!=0){
				int a = sc.nextInt(), b = sc.nextInt();
				u[a] = u[b] = true;
				e[a].add(b); e[b].add(a);
			}
			v = new boolean[101];
			res = 0;
//			int min = 150, max = 0;
//			for(int i=1;i<101;i++)if(u[i]){
//				min = Math.min(min, e[i].size()); max = Math.max(max, e[i].size());
//			}
			int[] a = new int[100];
			int id = 0;
			for(int i=1;i<101;i++)if(!e[i].isEmpty())a[id++] = i;
			Set<Integer> U = new HashSet<Integer>();
			for(int i=0;i<=id/3;i++){
				Arrays.fill(v, false);
				int s = rand.nextInt(id);
				while(U.contains(s))s = rand.nextInt(id);
				v[a[s]] = true;
				dfs(a[s], 1);
			}
//			for(int i=1;i<101;i++)if(u[i]){
//				Arrays.fill(v, false);
//				v[i] = true;
//				long S = System.currentTimeMillis();
//				dfs(i, 1);
//				System.out.println("S:"+i+" Time:"+(System.currentTimeMillis()-S)+" ms." + " RES:"+res);
//			}
			System.out.println(res);
		}
//		System.out.println((System.currentTimeMillis()-T)+" ms.");
	}
	
	public static void main(String[] args) {
		new Main().run();
	}
}