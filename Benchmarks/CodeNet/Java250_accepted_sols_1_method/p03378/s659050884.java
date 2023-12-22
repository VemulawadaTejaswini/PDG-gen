import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		int X = sc.nextInt();
		int row = 0;
		int high = 0;
		for(int i = 0; i < M; i++) {
			if(X > sc.nextInt()) {
				row++;
			}else {
				high++;
			}
		}
		System.out.println(Math.min(row, high));
	}
}
