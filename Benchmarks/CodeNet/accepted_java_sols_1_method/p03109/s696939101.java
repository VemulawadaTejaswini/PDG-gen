import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String[] s = scan.next().split("/",3);
		scan.close();

		int year =Integer.valueOf(s[0]);
		int month =Integer.valueOf(s[1]);
		//int day =Integer.valueOf(s[2]);
		System.out.println((year==2019&&month>=5)? "TBD":"Heisei");
	}
}
