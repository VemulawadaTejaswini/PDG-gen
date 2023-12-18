import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String s = sc.next();
		if(n % 2 ==1) {
			System.out.println("No");
			return;
		}
		if(s.substring(0,n/2).equals(s.substring(n/2))){
			System.out.println("Yes");
		}else {
			System.out.println("No");
		}


	}
}