import java.util.Scanner;


public class Main {


	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String in = sc.nextLine();
		int count = Integer.parseInt(in);
		int sum = 0;
		for (int i = 0; i < count; i++) {
			String line = sc.nextLine();
			String[] lineArray = line.split(" ");
			int start = Integer.parseInt(lineArray[0]);
			int end = Integer.parseInt(lineArray[1]);
			int lineSum = (end + 1) - start;
			sum += lineSum;
		}
		System.out.println(sum);
	}



}