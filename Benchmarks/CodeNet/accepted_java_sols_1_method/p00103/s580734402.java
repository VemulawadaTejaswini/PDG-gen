import java.util.Arrays;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int []p = new int[n];
		for(int i = 0; i < n; i++) {
			int out = 0;
			int []runner = new int[3];
			while(true) {
				String s = sc.next();
				if(s.equals("OUT")) {
					out++;
					if(out == 3) {
						Arrays.fill(runner, 0);
						break;
					}
				}else if(s.equals("HIT")) {
					if(runner[2] == 1) {
						p[i]++;
						runner[2] = 0;
					}
					if(runner[1] == 1) {
						runner[2] = 1;
						runner[1] = 0;
					}
					if(runner[0] == 1) {
						runner[1] = 1;
					}
					runner[0] = 1;
				}else {
					for(int j = 0; j < 3; j++) {
						if(runner[j] == 1) {
							p[i]++;
						}
					}
					p[i]++;
					Arrays.fill(runner, 0);
				}
			}
		}
		sc.close();
		for(int i : p) {
			System.out.println(i);
		}
	}
}
