import java.util.*;

public class Main {
	static int get(int a) {
		int b = 2;
		for(int i = 3;i <= a / 3;i += 2) {
			if(a % i == 0) {
				b ++;
			}
		}
		return b;
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int a = in.nextInt();
		int m = 0;
		if(a >= 105)m ++;
		for(int i = 107;i <= a;i += 2) {
			if(get(i) == 8)m ++;
		}
		System.out.println(m);
	}
}
