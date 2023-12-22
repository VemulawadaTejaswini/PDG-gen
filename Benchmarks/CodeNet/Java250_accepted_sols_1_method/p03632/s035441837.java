import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		String[] tempList = scanner.nextLine().split(" ");
		int A = Integer.parseInt(tempList[0]);
		int B = Integer.parseInt(tempList[1]);
		int C = Integer.parseInt(tempList[2]);
		int D = Integer.parseInt(tempList[3]);
		int result = 0;
			if(A >= C) {
				if(B >= D) {
					result = D - A;
				}else {
					result = B - A;
				}
			}else {
				if(B >= D) {
					result = D - C;
				}else {
					result = B - C;
				}
		}
		if(result < 0) {result = 0;}
		System.out.println(result);
	}
}