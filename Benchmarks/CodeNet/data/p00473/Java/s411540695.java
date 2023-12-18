import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] t = new int[n-1];
		for(int i=0;i<n-1;i++) {
			t[i] = sc.nextInt();
		}
		int ans = t[n/2-1]; // 1
		for(int i=0;i<n/2-1;i++) {
			ans = Math.min(ans, t[i]+t[n/2+i]); // 2
			for(int j=i+1;j-i<n/2-1;j++) {
				ans = Math.min(ans, t[i] + t[j] + t[j+n/2-i]); //3
			}
		}
		System.out.println(ans);
	}
}