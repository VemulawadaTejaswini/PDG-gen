import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		int W = scanner.nextInt();
		int H = scanner.nextInt();
		int x = scanner.nextInt();
		int y = scanner.nextInt();
		int r = scanner.nextInt();
		if(x>=r&y>=r&(x+r)<=W&(y+r)<=H) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}
		scanner.close();
	}
}
