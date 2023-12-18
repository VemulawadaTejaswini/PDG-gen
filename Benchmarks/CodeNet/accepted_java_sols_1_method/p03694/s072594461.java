import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int max = 0;
		int min = 1000;
		for(int i = 0; i < N; i++) {
			int a = sc.nextInt();
			if(max < a ) max = a;
			if(min > a ) min = a;
		}

		System.out.println(max - min);
	}
}
