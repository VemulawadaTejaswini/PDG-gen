import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);


		while(true) {

			int a = sc.nextInt();
			String op = sc.next();
			int c = sc.nextInt();

			if(op.equals("+")) {
				System.out.println(a + c);
			}else if(op.equals("-")) {
				System.out.println(a - c);
			}else if(op.equals("*")) {
				System.out.println(a * c);
			}else if(op.equals("/")){
				System.out.println(a / c);
			}else{
				break;
			}



		}

	}
}
