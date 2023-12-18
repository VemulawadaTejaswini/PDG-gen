import java.math.BigDecimal;
import java.util.*;

class Main {
	Scanner sc = new Scanner(System.in);

	public void run() {
		while(true){
			int n=sc.nextInt();
			if(n==-1)break;
			ln(new BigDecimal(Math.pow(n,1.0/3)).setScale(6,BigDecimal.ROUND_FLOOR).doubleValue());
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