import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		while(true) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			int[] num = new int[7];
			for(int i=0;i<n;i++) {
				int x = sc.nextInt();
				num[x >= 60 ? 6 : x / 10]++;
			}
			for(int i=0;i<7;i++) {
				System.out.println(num[i]);
			}
		}
	}

}