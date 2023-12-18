import java.util.*;

public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		HashMap<Integer,Integer> mp=new HashMap<Integer,Integer>();
		int n=sc.nextInt();
		int a[]=new int[n];
		for(int i=0;i<n;i++){
			a[i]=sc.nextInt();
			if(mp.get(a[i])==null)mp.put(a[i],1);
			else mp.put(a[i],mp.get(a[i]).intValue()+1);
		}
		int ans=0;
		for(int i:mp.keySet()){
			int t=mp.get(i);
			if(t>i)ans+=t-i;
			else if(t<i)ans+=t;
		}
		System.out.println(ans);
	}
}