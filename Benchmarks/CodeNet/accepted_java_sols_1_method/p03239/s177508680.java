import java.lang.reflect.Array;
import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner in = new java.util.Scanner(System.in);
		int N = in.nextInt();
		int T = in.nextInt();
		
		int minC = 10000;
		int c = 0;
		int t = 0;
		for(int i=0; i<N; i++) {
			c = in.nextInt();
			t = in.nextInt();
			if(t<=T) {
				if(c < minC) {
					minC = c;
				}
			}
		}
		
		if(minC == 10000) {
			System.out.println("TLE");
		}else {
			System.out.println(minC);
		}
		
		in.close();
	}
}
