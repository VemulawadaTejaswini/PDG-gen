import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) a[i] = sc.nextInt();
		int even = 0;
		int odd = 0;
		for(int i = 0 ; i < n ; i++) {
			if(a[i] % 2 == 0) even++;
			else odd++;
		}
		if(odd % 2 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}
