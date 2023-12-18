import java.util.ArrayList;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int m =scn.nextInt();
		ArrayList<ArrayList<Integer>> al=new ArrayList<>();
		for(int i=0;i<n;i++){
			ArrayList<Integer>al1=new ArrayList<>();
			al.add(al1);
		}
		HashSet<String> hs =new HashSet<>();
		for(int i=0;i<m;i++){
			int val1= scn.nextInt();
			int val2 =scn.nextInt();
		     String s1=val1+"#"+val2;
		     String s2=val2+"#"+val1;
		     if(hs.contains(s1)|| hs.contains(s2)){
		    	 continue;
		     }
		     hs.add(s1);
		     al.get(val1-1).add(val2-1);
		     al.get(val2-1).add(val1-1);
		     
		}
		int max=0;
		HashSet<Integer>hs1=new HashSet<>();
		for(int i=0;i<n;i++){
			cnt=0;
		     dfs(i,al,hs1);
		     max=Math.max(cnt, max);
		}
		 System.out.println(max);

	}
	static int cnt=0;
	public static void dfs(int s, ArrayList<ArrayList<Integer>>al , HashSet<Integer> hs){
		if(hs.contains(s)){
			return ;
		}
		hs.add(s);
		cnt++;
		
		for(int val : al.get(s)){
			dfs(val,al,hs);
		}
	}

}