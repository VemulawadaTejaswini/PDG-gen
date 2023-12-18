import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	//0137
	static class MiddleSquare_Method {
		void print_randomNum() {
			int inputNum = Integer.parseInt(sc.nextLine());
			int[] initialValue = new int[inputNum];
			for(int i=0; i<inputNum; i++) {
				initialValue[i] = Integer.parseInt(sc.nextLine());
			}
			for(int i=0; i<inputNum; i++) {
				System.out.println("Case " + (i+1) + ":");
				int squareNum = 0;
				for(int j=0; j<10; j++) {
					squareNum = (int) Math.pow(initialValue[i], 2);
					squareNum = squareNum / 100;
					initialValue[i] = squareNum % 10000;
					System.out.println(initialValue[i]);
				}
			}
		}
	}

	public static void main(String[] args) {
		MiddleSquare_Method msm = new MiddleSquare_Method();
		msm.print_randomNum();
	}
}