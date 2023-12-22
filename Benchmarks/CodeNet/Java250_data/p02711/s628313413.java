import java.util.*;


public class Main {

	static void log(String s) {
		System.out.println(s);
	}

	static void log(int i) {
		System.out.println(i);
	}

	/**
	 * @param args
	 */
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		String ans;
		
		if(a < 100 || a > 999) {
			ans = "No";
		}
		else if (a-(a % 100) == 700) {
			ans = "Yes";
		}
		else if ( (a%100)-(a%10) == 70) {
			ans = "Yes";
		}
		else if ( (a%10)-7 == 0) {
			ans = "Yes";
		}
		else
			ans = "No";
		
		sc.close();
		log( ans );

	}
}	
