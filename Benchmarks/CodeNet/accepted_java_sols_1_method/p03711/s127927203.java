import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		int y = scan.nextInt();
		boolean f1 = false;
		boolean f2 = false;
		if ((x!=2 && y == 2) ||(x==2 && y!= 2)) {
			System.out.println("No");
			return;
		}
		if (x==1 || x == 3 || x== 5 || x== 7 ||x==8||x==10||x==12) {
			f1 = true;
		}
		if (y==1 || y == 3 || y== 5 || y== 7 ||y==8||y==10||y==12) {
			f2 = true;
		}
		if (f1 == f2) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}
	}
}
