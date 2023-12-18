import java.util.*;

public class Main{
	public static void main(String[] args){
		
		Scanner sc= new Scanner (System.in);
		
		final int n = Integer.parseInt(sc.nextLine());
		String[] s = sc.nextLine().split(" ");
		int[] num = new int[n];
		int cnt=0;
		
		for(int i=0;i<n;i++){
			num[i]=Integer.parseInt(s[i]);
		}
		
		boolean flag=true;
		while(flag){
			flag=false;
			for(int i=n-1;i<2;i--){
				if(num[i]<num[i-1]){
					int str = num[i];
					num[i]=num[i-1];
					num[i-1]=str;
					cnt=+1;
					flag=true;
				}
			}
		}
		for(int i=0;i<n-1;i++){
			System.out.print(num[i]+" ");
		}
		System.out.println(num[n-1]);
		System.out.println(cnt);
	}
}
