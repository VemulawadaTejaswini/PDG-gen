import java.util.Arrays;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int k = scan.nextInt();
		int n = scan.nextInt();
		int a[] = new int[n];
		int dis[] = new int[n];
		int ans =0;
		
		for(int i=0;i<n;i++) {
			a[i] = scan.nextInt();
		}
		
		for(int i=0;i<n;i++) {
			if(i!=n-1) {
				dis[i] = a[i+1]-a[i];
			}else {
				dis[i] = k+a[0]-a[i];
			}
		}
		
		Arrays.sort(dis);
		
		for(int i=0;i<n-1;i++) {
			ans += dis[i];
		}
		
		System.out.println(ans);
		
	}	
}
