import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int N = stdIn.nextInt();
		if(N%1000 == 0) {
			System.out.println("0");
		}else {
			System.out.println(1000 - N%1000);
		}
		stdIn.close();
	}
}