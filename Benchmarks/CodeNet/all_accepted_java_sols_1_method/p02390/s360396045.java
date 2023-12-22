import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int S = stdIn.nextInt();
		int s = S%60;
		int m = S/60%60;
		int h = S/3600;
		System.out.println(h+":"+m+":"+s);
	}
}