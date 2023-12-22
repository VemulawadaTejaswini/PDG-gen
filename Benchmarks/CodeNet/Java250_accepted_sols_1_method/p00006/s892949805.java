import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		String str = sc.nextLine();
		StringBuffer sb = new StringBuffer(str);
		String rv =sb.reverse().toString();

		System.out.println(rv);

	}

}