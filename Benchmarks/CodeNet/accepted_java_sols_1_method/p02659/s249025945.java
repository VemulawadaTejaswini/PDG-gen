import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long A = sc.nextLong();
		String s = sc.next();
		
		long B = 0;
		int dotIndex = s.indexOf('.');
		int d = 0;
		if(dotIndex>=0) {
			B = Long.valueOf(s.substring(0, dotIndex) + s.substring(dotIndex+1));
			d = s.length() - dotIndex-1;
		} else {
			B = Long.valueOf(B);
			d = 0;
		}
		
		long ans = A*B;
		for(int i=0; i<d; i++)
			ans /= 10;

		System.out.println(ans);
		sc.close();
	}
}
