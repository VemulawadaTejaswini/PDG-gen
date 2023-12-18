
import java.util.*;

public class Main {
	
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		ArrayList<ArrayList<Integer>> graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<n;i++){
			graph.add(new ArrayList<Integer>());
		}
		for(int i=0;i<n;i++){
			int number = stdIn.nextInt();
			int x = stdIn.nextInt();
			ArrayList list = graph.get(number-1);
			for(int j=0;j<x;j++){
					int to = stdIn.nextInt();
					list.add(to);
			}
		}
		
		int[] id = new int[n+1];
		int[] d = new int[n+1];
		int[] f = new int[n+1];
		boolean[] judg = new boolean[n+1];
		Arrays.fill(judg,true);
		int count = 1;
		int now = 1;
		id[1] = count;
		d[1] = count;
		ArrayList<Integer> list = new ArrayList<Integer>();
		list = graph.get(0);
		while(true){
			if(list.isEmpty()){
				break;
			}
			else{
				int y = list.get(0);
				list.remove(0);
				while(f[y]!=0){
					if(list.isEmpty()){
						count++;
						f[1] = count;
						for(int i=1;i<=n;i++){
							System.out.println(i+" "+d[i]+" "+f[i]);
						}
						return;
					}
					y = list.get(0);
					list.remove(0);
				}
				list = graph.get(y-1);
				if(d[now]==0){
					count++;
					d[now] = count;
				}
				if(!judg[y] && f[now]==0){
					count++;
					f[now] = count;
				}
				if(f[y]==0){
					list.add(now);
				}
				judg[now] = false;
				now = y;
			}	
		}
		
		for(int i=1;i<=n;i++){
			System.out.println(i+" "+d[i]+" "+f[i]);
		}
		
	}
}