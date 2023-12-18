import java.util.Scanner;

class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 0;
		int a[] = new int[100000];
		int b[] = new int[100000];

		for(; i < 200; i++) {
			a[i] = sc.nextInt();
			b[i] = sc.nextInt();
		}

		for(int j = 0; j < i; j++) {
			String.valueOf(a[j] + b[j]).length();
		}
	}
}