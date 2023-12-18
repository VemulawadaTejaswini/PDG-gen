import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc=new Scanner(System.in);
		Reader reader=new Reader();
		int t=1;//sc.nextInt();
		while(t-->0) {
			int n=sc.nextInt();
			int m=sc.nextInt();
			ArrayList<ArrayList<Integer>> gp=new ArrayList<>();
			ArrayList<HashSet<Integer>> gpset=new ArrayList<>();
			for(int i=0;i<n;i++) {
				gp.add(new ArrayList<>());
				gpset.add(new HashSet<>());
			}
			for(int i=0;i<m;i++) {
				int u=sc.nextInt();
				int v=sc.nextInt();
				u--;v--;
				if(!gpset.get(u).contains(v)) {
					gpset.get(u).add(v);
					gp.get(u).add(v);
					gpset.get(v).add(u);
					gp.get(v).add(u);
				}
			}
			System.out.println(dfs(gp));
		}
	}
	static int dfs(ArrayList<ArrayList<Integer>> gp) {
		int max=0;
		boolean[] visited = new boolean[gp.size()];
		for(int i=0;i<gp.size();i++) {
			if(!visited[i]) {
				int cur=dfs_util(i,visited,gp);
				max=Math.max(cur, max);
			}
		}
		return max;
	}
	static int dfs_util(int index,boolean[] visited,ArrayList<ArrayList<Integer>> gp) {
		visited[index]=true;
		int count=1;
		for(int i: gp.get(index)) {
			if(!visited[i]) {
				count+=dfs_util(i,visited,gp);
			}
		}
		return count;
		
	}
}
class Reader{
	BufferedReader reader;
	Reader(){
		reader=new BufferedReader(new InputStreamReader(System.in));
	}
	int nextInt() throws IOException{
		String in=reader.readLine().trim();
		return Integer.parseInt(in);
	}
	long nextLong() throws IOException{
		String in=reader.readLine().trim();
		return Long.parseLong(in);
	}
	String next() throws IOException{
		return reader.readLine().trim();
	}
	String[] stringArray() throws IOException{
		return reader.readLine().trim().split("\\s+");
	}
	int[] intArray() throws IOException{
		String[] inp=this.stringArray();
		int[] arr=new int[inp.length];
		int i=0;
		for(String s:inp) {
			arr[i++]=Integer.parseInt(s);
		}
		return arr;
	}
}
