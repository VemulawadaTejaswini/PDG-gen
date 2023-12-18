
import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		for(;;) {
			int res = sc.nextInt();
			if( res == 0 ) break;
			for(int i=0;i<9;i++) {
				res -= sc.nextInt();
			}
			System.out.println(res);
		}
	}

	public static void main(String[] args) {
		try{
			System.setIn(new FileInputStream("A.in"));
			System.setOut(new PrintStream(new FileOutputStream("A.out")));
			}catch(Exception e){
//			System.err.println("Using standard input output.");
			}
			// System.setOut(new PrintStream(new BufferedOutputStream(System.out
			
			new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}