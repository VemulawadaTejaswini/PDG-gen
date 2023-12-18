import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

@SuppressWarnings("unchecked")
public class Main {
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		while(true){
			int n = sc.nextInt();
			if(n==0)break;
			int[] in = new int[26];
			int[] out = new int[26];
			List<Integer>[] node = new List[26];
			for (int i = 0; i < node.length; i++) {
				node[i]=new LinkedList<Integer>();
			}
			for (int i = 0; i < n; i++) {
				String s = sc.next();
				out[s.charAt(0)-'a']++;
				in[s.charAt(s.length()-1)-'a']++;
				node[s.charAt(0)-'a'].add(s.charAt(s.length()-1)-'a');
			}
			boolean f = true;
			int s = 0,t=0,same=0;
			for (int i = 0; i < in.length; i++) {
				if(in[i]!=out[i]){
					f=false;
				}
			}
			boolean connected = true;
			isVisited=new boolean[26];
			int size = 0;
			for (int i = 0; i < node.length; i++) {
				if(in[i]>=1){
					size = size(i,node,new boolean[26]);
					break;
				}
			}

			for (int i = 0; i < in.length; i++) {
				if(in[i]>0)--size;
			}

			if(f&&size==0){
				System.out.println("OK");
			} else {
				System.out.println("NG");
			}
		}
	}
	static boolean[] isVisited;
	static int size(int cur,List<Integer>[]node,boolean[] visited){
		if(isVisited[cur])return 0;
		int res = 1;
		isVisited[cur]=true;
		for(Integer next:node[cur]){
			if(isVisited[next])continue;
			res+=size(next,node,visited);
		}
		return res;
		
	}
}