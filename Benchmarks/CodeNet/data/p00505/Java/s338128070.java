import java.io.PrintStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	static PrintStream so = System.out;
	
	public static void main(String[] args) throws InterruptedException {
		Map<TRIANGLE_KIND, Integer> counter = new HashMap<>();
		int totalCount = 0;
		counter.put(TRIANGLE_KIND.RIGHT, 0);
		counter.put(TRIANGLE_KIND.ACUTE_ANGLED, 0);
		counter.put(TRIANGLE_KIND.OBTUSE_ANGLED, 0);
		
		while (true) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			
			TRIANGLE_KIND kind = kind(a, b, c);
			if (kind == TRIANGLE_KIND.NOT_TRIANGLE)
				break;
			
			totalCount++;
			counter.put(kind, counter.get(kind) + 1);
		}
		
		so.println(
				totalCount + " " + 
				counter.get(TRIANGLE_KIND.RIGHT) + " " +
				counter.get(TRIANGLE_KIND.ACUTE_ANGLED) + " " + 
				counter.get(TRIANGLE_KIND.OBTUSE_ANGLED));
	}
	static TRIANGLE_KIND kind(int a, int b, int c) {
		int max = Math.max(a, Math.max(b, c));
		int min = Math.min(a, Math.min(b, c));
		int mid = a+b+c - (min+max);
		
		if (max >= min + mid) return TRIANGLE_KIND.NOT_TRIANGLE;
		
		int d = max*max - (min*min + mid*mid);
		return d == 0 ? TRIANGLE_KIND.RIGHT :
			   d > 0  ? TRIANGLE_KIND.OBTUSE_ANGLED :
			            TRIANGLE_KIND.ACUTE_ANGLED;
	}
	

	enum TRIANGLE_KIND {
		NOT_TRIANGLE(0),
		RIGHT(1), // 直角
		ACUTE_ANGLED(2), // 鋭角 
		OBTUSE_ANGLED(3); // 鈍角
		
		int num;
		TRIANGLE_KIND(int i) {
			this.num = i;
		}
	}
}

