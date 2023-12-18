
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;

	void run() {
		Scanner sc = new Scanner(System.in);
		boolean atnd[] = new boolean[30];
		for(int i=0;i<28;i++) {
			atnd[sc.nextInt()-1] = true;
		}
		for(int i=0;i<30;i++) if(!atnd[i]){
			System.out.println(i+1);
		}
	}

	public static void main(String[] args) {
		new Main().run();
	}

	void debug(Object... os) {
		System.err.println(Arrays.deepToString(os));
	}
}