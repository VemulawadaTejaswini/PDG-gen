import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int x = 0;
		int y = 0;
		int t = 0;
		for(int i = 0; i < n; i++) {
			int targetT = sc.nextInt();
			int targetX = sc.nextInt();
			int targetY = sc.nextInt();
			if((targetT -t) < (Math.abs(targetX -x) + Math.abs(targetY -y))) {
				System.out.println("No");
				return;
			}
			if((targetT -t) == (Math.abs(targetX -x) + Math.abs(targetY -y))) {
				x = targetX;
				y = targetY;
				t = targetT;
				continue;
			}
			if(((targetT -t) - ((Math.abs(targetX -x) + Math.abs(targetY -y)))) % 2 ==0) {
				x = targetX;
				y = targetY;
				t = targetT;
				continue;
			}else {
				System.out.println("No");
				return;
			}
		}
		System.out.println("Yes");
	}
}