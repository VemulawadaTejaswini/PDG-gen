
import java.io.*;
import java.util.*;
import java.math.*;


public class Main {
	Scanner sc = new Scanner(System.in);

	class score implements Comparable<score>{
		int id;
		int t;
		public int compareTo(score tar){
			return t - tar.t;
		}
		
		score(Scanner sc){
			id = sc.nextInt();
			t=0;
			t += sc.nextInt()*60+sc.nextInt();
			t += sc.nextInt()*60+sc.nextInt();
			t += sc.nextInt()*60+sc.nextInt();
			t += sc.nextInt()*60+sc.nextInt();
					
		}
		
	}
	
	void run() {
		for (;;) {
			int n = sc.nextInt();
			if (n == 0) {
				break;
			}
			score s [] = new score[n];
			for (int i  = 0; i < n; i++) {
				s[i] = new score(sc);
			}
			Arrays.sort(s);
			
			System.out.println(s[0].id);
			System.out.println(s[1].id);
			System.out.println(s[n-2].id);
		}

	}

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}

}