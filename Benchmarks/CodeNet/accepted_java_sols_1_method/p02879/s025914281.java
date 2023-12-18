import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		String a = sc.next();
		String b = sc.next();
		if(a.length() >1 || b.length() >1) {
			System.out.print(-1);
		}else {
			System.out.println(Integer.valueOf(a) * Integer.valueOf(b));
		}


	}
}