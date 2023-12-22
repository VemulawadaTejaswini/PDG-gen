import java.util.*;
import java.util.Arrays;

public class Main{
	
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] a = new long[n];
		for(int i=0;i<n;i++){
			a[i] = sc.nextLong();
		}
		int ans = 1;
		int sign = 0;
		for(int i=0;i<n-1;i++){
			switch(sign){
				case 0:
						if(a[i]<a[i+1]){
							sign = 1;
						}
						else if(a[i]>a[i+1]){
							sign = -1;
						}
						break;
				case 1:
						if(a[i]>a[i+1]){
							sign = 0;
							ans++;
						}
						break;
				
				case -1:
						if(a[i]<a[i+1]){
							sign = 0;
							ans++;
						}
						break;

			}
		}
		System.out.println(ans);
		
		
	}
}









