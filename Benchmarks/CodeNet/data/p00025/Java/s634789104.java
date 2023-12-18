
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main {

	int INF = 1 << 28;
	
	void run() {
		Scanner sc = new Scanner(System.in);
		while (sc.hasNext()) {
			int a[] = new int[4];
			int b[] = new int[4];
			for(int i=0;i<4;i++) a[i] = sc.nextInt();
			for(int i=0;i<4;i++) b[i] = sc.nextInt();
			int hit = 0;
			int br = 0;
			
			for( int i=0;i<4;i++ ) for (int j=0;j<4;j++){
				if(a[i] == b[j] ) {
					if(i == j)hit++;
					else br++;
				}
			}
			System.out.println(hit + " " + br);
		}
	}
	public static void main(String[] args) {
		new Main().run();
	}
}