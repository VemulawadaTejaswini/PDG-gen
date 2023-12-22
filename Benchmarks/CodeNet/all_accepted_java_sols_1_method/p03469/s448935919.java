import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{
		Scanner scan = new Scanner(System.in);
		String str = scan.next();
		System.out.println("2018" + str.substring(4));
		scan.close();
	}

}
