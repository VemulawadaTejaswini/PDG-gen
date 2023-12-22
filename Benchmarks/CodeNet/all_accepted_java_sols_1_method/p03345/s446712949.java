import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long a=sc.nextInt();
		long b=sc.nextInt();
		long c=sc.nextInt();
		String k=sc.next();

		String s ="";
		s = String.valueOf(k.charAt(k.length()-1));
		int num = Integer.parseInt(s);


		if(num%2==0) {
			System.out.print(a-b);
		}
		else {
			System.out.print(b-a);
		}
	}


}
