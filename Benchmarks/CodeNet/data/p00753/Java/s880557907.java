
import java.io.*;
import java.util.*;
import static java.lang.Math.*;
import static java.util.Arrays.*;

public class Main{

	int INF = 1 << 28;
	int MAX = 123456 * 2;
	boolean[] ip = new boolean[MAX+1];
	void run() {
		Scanner sc = new Scanner(System.in);
		ip[0] = ip[1] = true;
		for (int i = 2; i < ip.length; i++) if( !ip[i]) {
			for(int j=i*2;j<=MAX;j+=i) ip[j] = true;
		}
		
		for(;;) {
			int n = sc.nextInt();
			if( n == 0) break;
			int cnt=0;
			for(int i=n+1;i<=2*n;i++) if(!ip[i]) cnt++;
			System.out.println(cnt);
		}
	}

	public static void main(String[] args) {
		try {
			System.setIn(new FileInputStream("A.in"));
			System.setOut(new PrintStream(new FileOutputStream("A.out")));
		} catch(Exception e){
		
		}
		new Main().run();
	}
	
	
}