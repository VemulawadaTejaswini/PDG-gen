import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			final long a = sc.nextLong();
			final String ops = sc.next();
			final long b = sc.nextLong();

			if("?".equals(ops)){
				break;
			}else if("+".equals(ops)){
				System.out.println(a + b);
			}else if("-".equals(ops)){
				System.out.println(a - b);
			}else if("*".equals(ops)){
				System.out.println(a * b);
			}else if("/".equals(ops)){
				System.out.println(a / b);
			}
			
			
		}
	}

}