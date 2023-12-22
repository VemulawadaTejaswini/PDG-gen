import java.util.*;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int d = in.nextInt();
		int n = in.nextInt();
		int s = 1;
		for(int i = 0;i < d;i ++) {
			s *= 100;
		}
		if(n == 100)n ++;
		System.out.println(s * n);
	}
}
