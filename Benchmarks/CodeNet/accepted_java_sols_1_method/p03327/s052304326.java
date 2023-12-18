import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		if (num <= 999) {
			System.out.println("ABC");
		} else System.out.println("ABD");
		scan.close();
	}

}