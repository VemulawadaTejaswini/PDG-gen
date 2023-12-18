import java.util.*;

class Main {
	public static void main (String[] args) throws java.lang.Exception {
		Scanner sc = new Scanner(System.in);
		int num, i = 0;
		while(true) {
			num = sc.nextInt();
			if(num == 0) break;
			System.out.println("Case " + (++i) + ": " + num);
		}
	}
}
