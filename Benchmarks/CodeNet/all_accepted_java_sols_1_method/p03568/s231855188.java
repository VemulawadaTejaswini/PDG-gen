import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long pi = 1;
		for(int i=0;i<n;i++) {
			int a = sc.nextInt();
			if (a % 2 == 0) {
				pi *= 2;
			}else{
				pi *= 1;
			}
		}
		long all = 1;
		for(int i=0;i<n;i++) {
			all *= 3;
		}
		System.out.println(all - pi);
	}
}
