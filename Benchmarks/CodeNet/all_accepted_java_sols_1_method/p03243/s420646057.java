import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();
		int n = sc.nextInt();
		for (int i = 111; i < 1000; i = i + 111) {
			if(n <= i) {
				System.out.println(i);
				break;
			}
		}
	}
}
