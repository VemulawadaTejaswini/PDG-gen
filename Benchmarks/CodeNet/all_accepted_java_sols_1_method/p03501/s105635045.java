
import java.io.IOException;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int a = s.nextInt();
		int b = s.nextInt();
		int p1 = n * a;
		int r = p1;
		if(p1 > b){
			r = b;
		}

		System.out.println(r);
	}
}
