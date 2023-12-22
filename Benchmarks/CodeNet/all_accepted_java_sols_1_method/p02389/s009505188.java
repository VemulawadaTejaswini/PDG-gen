import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] resultArray = line.split(" ");
		int a = Integer.parseInt(resultArray[0]);
		int b = Integer.parseInt(resultArray[1]);
		System.out.print(a * b +" ");
		System.out.println(a * 2 + b * 2);
	}

}