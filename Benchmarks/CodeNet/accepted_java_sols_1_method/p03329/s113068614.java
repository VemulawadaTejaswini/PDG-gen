import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		ArrayList<Integer> list=new ArrayList<>();
		int nine=1;
		while(nine<=n){
			nine*=9;
			list.add(nine);
		}
		int six=1; 
		while(six<=n){
			six*=6;
			list.add(six);
		}
		list.add(1);
		Collections.sort(list);
		int[] dp=new int[n+1];
		for(int i=0; i<n; i++){
			for(int j=0; j<list.size(); j++){
				int a=list.get(j);
				if(a+i>n){
					break;
				}
				if(dp[a+i]==0){
					dp[a+i]=dp[i]+1;
				}else{
					dp[a+i]=Math.min(dp[a+i],dp[i]+1);
				}
			}
		}
		System.out.println(dp[n]);
	}
}

