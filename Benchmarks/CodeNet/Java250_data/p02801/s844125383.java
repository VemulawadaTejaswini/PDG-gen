import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		char[] alphabet =  sc.next().toCharArray();

		alphabet[0]++;

		System.out.println(alphabet[0]);
	}
}

