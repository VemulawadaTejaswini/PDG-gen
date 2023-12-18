import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char c[] = sc.next().toCharArray();
		if(c[c.length - 1] == '0' ||c[c.length - 1] == '1' ||c[c.length - 1] == '6' || c[c.length - 1] == '8')
			System.out.println("pon");
		else if(c[c.length - 1] == '2' ||c[c.length - 1] == '4'||c[c.length - 1] == '5'||c[c.length - 1] == '7'||c[c.length - 1] == '9')
			System.out.println("hon");
		else if(c[c.length - 1] == '3')
			System.out.println("bon");
	}

}
