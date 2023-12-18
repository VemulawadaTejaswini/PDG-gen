import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn=new Scanner(System.in);
		int n=scn.nextInt();
		int k =scn.nextInt();
		//int []arr1=new int[n];
		long []arr2 =new long[n];
		ArrayList<ArrayList<Integer>>al =new ArrayList<>();
		for(int i=0;i<n;i++){
			ArrayList<Integer> al1 =new ArrayList<>();
			al.add(al1);
		}
		for(int i=0;i<n;i++){
			int val =scn.nextInt();
			al.get(i).add(val-1);
			
		}
		for(int i=0;i<n;i++){
			arr2[i]=scn.nextLong();
		}
		long ans=Integer.MIN_VALUE;
		//HashMap<Integer,Integer>hm =new HashMap<>();
		
		HashSet<Integer> hs =new HashSet<>();
		 long [][]cost =new long[n][2];
		 
		 for(int i=0;i<n;i++){
			
			res(i,al,arr2,cost,0,hs,0l);
		 }
		 hs =new HashSet<>();
		 long res=Integer.MIN_VALUE;
		 for(int i=0;i<n;i++){
			// System.out.println(cost[i][0]+" "+cost[i][1]+" "+i);
			 if(cost[i][1]>k){
				 if(cost[i][0]>=0){
					 ans+=(long)(k/cost[i][1])*cost[i][0];
					 ans+=find(i,al,(int)(k%cost[i][1]),arr2,hs);
				 }else{
					 ans=find(i,al,(int)cost[i][1],arr2,hs);
				 }
			 }else{
				 ans=find(i,al,k,arr2,hs);
			 }
			 res=Math.max(res, ans);
		 }
		 System.out.println(res);
	}
	public static pair res(int s ,ArrayList<ArrayList<Integer>> al, long []arr2,long [][]cost,int cnt ,
			HashSet<Integer> hs,long val){
		
		if(hs.contains(s)){
		 //return cnt;
			return new pair(val,cnt);
		}
		hs.add(s);
	   for(int  s1: al.get(s)){
		pair p=  res(s1,al,arr2,cost,cnt+1,hs,val+arr2[s]);
		cost[s][0]=p.val;
		cost[s][1]=p.cnt;
	   }
	   pair p =new pair(cost[s][0],cost[s][1]);
	  //  hs.remove(s);
	    return p;
	//return ans;
	}
	public static class pair{
		long val;
		long cnt;
		public pair(long val ,long cnt){
			this.val=val;
			this.cnt=cnt;
		}
	}
	
	public static long find(int s,ArrayList<ArrayList<Integer>>al,int k,long []arr2, HashSet<Integer>visited){
		if(k==0){
			return 0;
		}
		visited.add(s);
		long ans=Integer.MIN_VALUE;
		for(int val : al.get(s)){
			ans=Math.max(find(val,al,k-1,arr2,visited)+arr2[s],arr2[s] );
		}
		visited.remove(s);
		return ans;
	}

}