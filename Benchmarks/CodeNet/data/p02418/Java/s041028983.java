import java.io.IOException;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) throws IOException{

		Scanner sc = new Scanner(System.in);

		String x = sc.nextLine();
		x += x;
		String y = sc.nextLine();

		if(x.contains(y)) {
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}

		sc.close();
	}
}
