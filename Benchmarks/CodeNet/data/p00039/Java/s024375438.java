import java.io.IOException;
import java.lang.reflect.Array;
import java.util.*;

class Main {
	public static void main(String[] args) throws IOException {
		Scanner in = new Scanner(System.in);
		while(in.hasNext()) {
			String s = in.nextLine();
			System.out.println(toArabian(s));
		}
	}

	public static int toArabian(String s) {
		int ans = 0;
		int before = 0;
		for(int i=s.length()-1;i>=0;i--) {
			int d = 1000000;
			switch (s.charAt(i)) {
				case 'I':
					d = 1;
					break;
				case 'V':
					d = 5;
					break;
				case 'X':
					d = 10;
					break;
				case 'L':
					d = 50;
					break;
				case 'C':
					d = 100;
					break;
				case 'D':
					d = 500;
					break;
				case 'M':
					d = 1000;
					break;
			}
			if(before > d) {
				ans -= d;
			} else {
				ans += d;
			}
			before = d;
		}
		return ans;
	}
}