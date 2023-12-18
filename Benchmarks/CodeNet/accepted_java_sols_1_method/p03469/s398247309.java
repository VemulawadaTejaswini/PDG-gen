
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		String s=scan.nextLine();
		System.out.println(s.replace(s.substring(0, 4), "2018"));

	}

}