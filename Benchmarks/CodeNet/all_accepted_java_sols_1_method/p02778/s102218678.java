import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String[] x  = sc.next().split("");
		
		String ans = "";
		for(int i = 0 ; i < x.length ; i++) {
			ans = ans + "x";
			
		}
		
		System.out.println(ans);
	}




}

