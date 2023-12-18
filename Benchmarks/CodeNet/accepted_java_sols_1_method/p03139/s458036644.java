import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Integer n = null;
		Integer x = null;
		Integer y = null;
		boolean err = false;
        Scanner scan = new Scanner(System.in);
        String[] sl = scan.nextLine().split(" ");
		try {
			n = Integer.parseInt(sl[0]);
			x = Integer.parseInt(sl[1]);
			y = Integer.parseInt(sl[2]);
		}
		catch (Exception e) {
			System.out.println("不正な入力が含まれています。");
			err = true;
		}

		if (err == false) {
		// 最大値と最小値を求める
			Integer max;
			Integer min;

			if (x < y){
				max = x;
			}
			else {
				max = y;
			}


			if (x + y <= n) {
				min = 0;
			}
			else {
				min = (x + y) - n;
			}

			System.out.println(max + " " + min);
		}
	}
}
