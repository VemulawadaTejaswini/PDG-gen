import java.util.Scanner;


public class Main {

	public static void main(String[] args)  {

		Scanner sc = new Scanner(System.in);
		int s1 = Integer.parseInt(sc.next());
		int s2 = Integer.parseInt(sc.next());
		int w1 = Integer.parseInt(sc.next());
		int w2 = Integer.parseInt(sc.next());

		String ans = "No ";

		while(s1 > 0 && w1 > 0) {
			w1 -= s2;
			s1 -= w2;
			if(w1 <= 0) {
				ans = "Yes";
			}

		}

		System.out.println(ans);
	}

}
