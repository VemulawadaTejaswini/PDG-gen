import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		// TODO ?????????????????????????????????????????????
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] x = line.split(" ");
		int a = Integer.parseInt(x[0]);
		int b = Integer.parseInt(x[1]);
		int c = Integer.parseInt(x[2]);
		if (a < b && b < c) {
			System.out.println("Yes");
		} else {
			System.out.println("No");
		}

	}

}