import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		String t = sc.next();
		//long n = sc.nextLong();
		//long m = sc.nextLong();
		//long k = sc.nextLong();

		if(s.substring(0, 1).equals(t.substring(2,3))&&s.substring(1, 2).equals(t.substring(1,2))&&s.substring(2, 3).equals(t.substring(0,1))) {
			System.out.println("YES");
		}else{
			System.out.println("NO");
		}
		//System.out.println(2*m-n);
	}
}


