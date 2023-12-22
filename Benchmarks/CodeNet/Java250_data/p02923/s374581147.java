import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int now = sc.nextInt();
		int count =0;
		int max =0;
		for (int i=1;i<N;i++) {
			int temp = sc.nextInt();
			if (temp<=now) {
				count++;
				if (count>max) {
					max = count;
				}
			} else {
				count =0;
			}
			now = temp;
		}
		System.out.println(max);
	}
}