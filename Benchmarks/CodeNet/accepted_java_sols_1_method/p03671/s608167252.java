
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	String line = br.readLine();

		Scanner scan = new Scanner(System.in);
		int a = scan.nextInt();
		int b = scan.nextInt();
		int c = scan.nextInt();
		int ab = a+b;
		int bc = c+b;
		int ca = a+c;
int d = Math.min(ab,bc);

		System.out.println(Math.min(d,ca));

}
}