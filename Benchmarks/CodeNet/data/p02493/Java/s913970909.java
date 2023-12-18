import java.util.*;

class Main {
	public static void main(String args[]) {
		Scanner scanner = new Scanner(System.in);
		int n, a[] = new int[100];
		n = scanner.nextInt();
		for(int i = 0;i < n;i++) {
			a[i] = scanner.nextInt();
		}
		for(int i = n-1;i >= 0;i--) {
			System.out.print(a[i]);
			if(i > 0)
				System.out.print(" ");
		}
		System.out.println("");
		scanner.close();
	}
}