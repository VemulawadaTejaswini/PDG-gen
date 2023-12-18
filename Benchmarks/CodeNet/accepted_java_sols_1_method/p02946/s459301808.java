import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int k = sc.nextInt();
		int x = sc.nextInt();

		int min = x-k+1;
		int max = x+k-1;

		StringBuilder sb = new StringBuilder();
		for(int i=min; i<=max; i++) {
			if(i > 1000000 || i < -1000000) {
				break;
			}
			if(i == min) {
				sb.append(i);
			} else {
				sb.append(" " + i);
			}
		}
		System.out.println(sb.toString());
	}
}