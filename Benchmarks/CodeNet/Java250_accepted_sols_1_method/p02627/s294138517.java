import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String x = scan.next();
		if(x.matches("^[a-z]*$"))System.out.println('a');
		else if(x.matches("^[A-Z]*$")) System.out.println('A');
		scan.close();
	}

}
