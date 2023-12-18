import java.math.BigDecimal;
import java.math.MathContext;
import java.util.*;
//無理やりBigDecimalで通したが 循環小数の考え方で任意の整数で可能。
class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(sc.hasNext()){
			int n=sc.nextInt();

			int val=1;
			for(int i=0;i<n;i++){
				val+=1+i;
			}
			ln(val);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	public static void pr(Object o) {
		System.out.print(o);
	}

	public static void ln(Object o) {
		System.out.println(o);
	}

	public static void ln() {
		System.out.println();
	}
}