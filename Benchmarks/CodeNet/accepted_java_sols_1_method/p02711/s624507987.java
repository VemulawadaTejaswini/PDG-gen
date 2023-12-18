import java.util.Scanner;
public class Main {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int n = scan.nextInt();
		String re = "";

		re = String.valueOf(n);

		System.out.println(re.contains("7")?"Yes":"No");
		scan.close();
	}

}
