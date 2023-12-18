import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		System.out.println(num + num*num + num*num*num);
	}
}