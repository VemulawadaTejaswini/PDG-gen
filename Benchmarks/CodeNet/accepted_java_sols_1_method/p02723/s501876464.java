import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		String mozi = scan.next();

		System.out.println(mozi.substring(2,3).equals(mozi.substring(3,4)) && mozi.substring(4,5).equals(mozi.substring(5,6))?"Yes":"No");

		scan.close();

	}

}
