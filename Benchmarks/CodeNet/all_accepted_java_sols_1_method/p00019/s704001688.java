
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		long cou=1;
		for(int i=n;0<n;n--){
			cou=cou*n;
		}
		System.out.println(cou);
	}
}