import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String red = sc.next();
		String blue = sc.next();
		int redN = sc.nextInt();
		int blueN = sc.nextInt();
		String either = sc.next();

		if(either.equals(red)) {
			redN--;
		}else {
			blueN--;
		}

		System.out.println(redN + " " + blueN);
	}
}