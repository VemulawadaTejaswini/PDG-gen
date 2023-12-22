import java.util.Scanner;


public class Main {

	
	public static void main(String[] args) {
		double debt = 100000;
		Scanner stdIn = new Scanner(System.in);
		int n = Integer.parseInt(stdIn.next());
		for (int i = 1; i <= n; i++) {
			debt += (debt * 0.05);
			int tmp = (int)(debt / 1000);
			if((debt/1000) != tmp) debt = ((tmp*1000) + 1000);
		}
		System.out.println((long)debt);
	}

}