import java.util.*;
import static java.lang.System.*;

public class Main {

	Scanner sc = new Scanner(in);
	
	void run() {
		int n = sc.nextInt();
		int m = 100000;
		for (int i = 0; i < n; i++) {
			m += (int)Math.ceil(m*0.05/1000)*1000;
		}
		out.println(m);
	}
	
	public static void main(String[] args) {
		new Main().run();
	}

}