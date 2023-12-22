
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Main main = new Main();
		main.run();
	}

	public void run() {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();

		int a1 = Integer.parseInt(s.substring(0, 2));
		int a2 = Integer.parseInt(s.substring(2, 4));

		boolean m1 = false;
		if(1<=a1 && a1 <= 12) {
			m1=true;
		}
		boolean m2 = false;
		if(1<=a2 && a2 <= 12) {
			m2=true;
		}

		String ans = "";
		if(m1 && m2) {
			ans = "AMBIGUOUS";
		}else if(m1 && ! m2) {
			ans = "MMYY";
		}else if(! m1 && m2) {
			ans = "YYMM";
		}else {
			ans = "NA";
		}
		System.out.println(ans);
		sc.close();
	}

}
