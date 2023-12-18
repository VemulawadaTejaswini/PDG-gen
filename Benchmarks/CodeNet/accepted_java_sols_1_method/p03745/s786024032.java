import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
//		// get a integer
//		int a = sc.nextInt();
//		// get a string
//		String s = sc.next();
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i=0; i<n; i++){
			a[i] = sc.nextInt();
		}
		int cnt = 1;
		for(int i=0; i<n-1; i++){
			if(a[i]==a[i+1])	continue;
			if(a[i]<a[i+1]){
				while(i<n-1 && a[i]<=a[i+1])	i++;
				cnt++;
			}
			else{
				while(i<n-1 && a[i]>=a[i+1])	i++;
				cnt++;
			}
			if(i==n-1)	cnt--;
		}
		System.out.println(cnt);
	}
}
