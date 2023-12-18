import java.util.Scanner;
public class Main {
	public static void main(String[] a) {
		Scanner stdIn = new Scanner(System.in);
		while(stdIn.hasNext())
			System.out.println(stdIn.nextInt()-stdIn.nextInt());
	}
}