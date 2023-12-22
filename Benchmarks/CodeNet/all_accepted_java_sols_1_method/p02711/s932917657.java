import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s = sc.next();
		if(s.contains("7"))
			System.out.println("Yes");
		else
			System.out.println("No");
		sc.close();
	}

}