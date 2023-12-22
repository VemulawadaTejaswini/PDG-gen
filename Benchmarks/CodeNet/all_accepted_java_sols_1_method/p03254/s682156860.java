import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0;i<n;i++){
			a[i] = sc.nextInt();
		}
		Arrays.sort(a);
		int ans = 0;
		int po = 0;
		for(int i=0;i<n;i++){
			po = po + a[i];
			if(po<=x){
				ans++;
			}else{
				break;
			}
		}
		if(po < x){
			ans--;
		}
		System.out.println(ans);
		
;	}
}
