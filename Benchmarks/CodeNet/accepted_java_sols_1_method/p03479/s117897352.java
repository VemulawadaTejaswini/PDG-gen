import java.util.*;

public class Main {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		long X = sc.nextLong();
		long Y = sc.nextLong();
		long cnt = 1;
		
		while(true) {
			X *= 2;
			if(X > Y) {
				break;
			} else {
				cnt++;
			}
		}
		System.out.println(cnt);
	}
}
