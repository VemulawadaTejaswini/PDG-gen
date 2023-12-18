import java.util.Scanner;

public class Main{

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		int n        = Integer.parseInt(scanner.nextLine());
		String[] tmp = scanner.nextLine().split(" ");
		int[] list   = new int[n];
		int now   = 0;
		int was   = 1;
		int point = 0;
		for(int i = 0;i < n; i ++) {

			now = Integer.parseInt(tmp[i]);

			if(now == was) {
				was++;
			}else {
				point++;
			}


		}

		if(point == tmp.length) {

			System.out.println(-1);

		}else {

			System.out.println(point);

		}
	}
}