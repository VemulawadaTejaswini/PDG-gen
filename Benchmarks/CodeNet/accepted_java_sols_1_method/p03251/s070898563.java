
import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		//n
		String[] temp = scanner.nextLine().split(" ");
		int n = Integer.parseInt(temp[0]);
		int m = Integer.parseInt(temp[1]);
		int x = Integer.parseInt(temp[2]);
		int y = Integer.parseInt(temp[3]);

		//list 差を求める
		String[] temp2 = scanner.nextLine().split(" ");
		String[] temp3 = scanner.nextLine().split(" ");
		int[] xlist = new int[n];
		int[] ylist = new int[m];

		xlist[n - 1] = Integer.parseInt(temp2[n - 1]);
		ylist[0] = Integer.parseInt(temp3[0]);

		for(int i = n - 1; i >= 0; i--) {
			xlist[n - 1] = Math.max(xlist[n - 1], Integer.parseInt(temp2[i]));

		}
		for(int i = 1; i < m; i++) {
			ylist[0] = Math.min(ylist[0], Integer.parseInt(temp3[i]));
		}

		if(x < ylist[0] && y > xlist[n - 1] && x <= y && xlist[n - 1] < ylist[0]) {
			System.out.println("No War");
		}else {
			System.out.println("War");
		}


	}
}
