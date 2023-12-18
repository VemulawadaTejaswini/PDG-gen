import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String s = scan.next();
		scan.close();

		String str[]=s.split(",", 3);
		System.out.println(str[0]+" "+str[1]+" "+str[2]);
	}
}