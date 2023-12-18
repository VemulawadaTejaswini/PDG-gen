import java.util.*;
import java.io.PrintWriter;
public class Main{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		HashMap<Integer,Integer> map=new HashMap<>();
		int[] a=new int[n];
		for(int i=0; i<n; i++){
			a[i]=sc.nextInt();
			if(map.containsKey(i+1-a[i])){
				map.put(i+1-a[i],map.get(i+1-a[i])+1);
			}else{
				map.put(i+1-a[i],1);
			}
		}
		long ans=0;
		for(int i=0; i<n; i++){
			if(map.get(i+1+a[i])!=null){
				ans+=map.get(i+1+a[i]);
			}
		}
		System.out.println(ans);
	}
}