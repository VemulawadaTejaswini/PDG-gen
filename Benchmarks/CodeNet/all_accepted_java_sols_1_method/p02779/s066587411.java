import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		boolean flag = true;
		for(int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}
		Arrays.parallelSort(a);;
		for(int i = 0; i < n-1; i++) {
			if(a[i]==a[i+1]) {
				flag = false;
				break;
			}
		}
		if(flag) {
			System.out.println("YES");
		}else {
			System.out.println("NO");
		}
	}
}
