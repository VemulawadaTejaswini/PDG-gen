import java.io.IOException;
import java.util.Scanner;

public class Main {

public static void main(String[] args) throws IOException {
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		System.out.println(n+(n*n)+(n*n*n));
}
}
