import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		String A =  sc.next();
		String ans = "ABC";
		
		if(A.equals(ans)) {
			ans = "ARC";
		}
		
		System.out.println(ans);
	}



}

