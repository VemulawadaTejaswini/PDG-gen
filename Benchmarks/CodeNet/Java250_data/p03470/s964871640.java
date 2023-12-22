import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		int[] dary = new int[n];
		for(int i=0; i<n; i++) {
			dary[i] = sc.nextInt();
		}
		Arrays.sort(dary);

		int ans = 1,temp=dary[0];
		for (int i : dary) {
			if(temp<i) {
				ans++;
				temp = i;
			}
		}
		System.out.println(ans);
	}
}
