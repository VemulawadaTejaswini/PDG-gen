import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true) {
			int N = stdIn.nextInt();
			if(N == 0) break;
			String kka = stdIn.next();
			
			String[] c = new String[100];
			
			for(int i = 0; i < 100; i++) {
				c[i] = Character.toString(kka.charAt(i));
			}
			String[][] m = new String[N][100];
			String[] ba = new String[100];
			
			int bapp = 0; //場のポインタ
			
			int[] pp = new int[N];
			
			int pc = 0;
			
			for(int i = 0; i < 100; i++) {
				if(c[i].equals("M")) {
					m[pc][pp[pc]] = "M";
					pp[pc]++;
				}
				if(c[i].equals("S")) {
					ba[bapp++] = "S";
					for(int j = 0; j < pp[pc]; j++) {
						ba[bapp++] = m[pc][pp[pc]];
					}
					pp[pc] = 0;
				}
				if(c[i].equals("L")) {
					m[pc][pp[pc]++] = "L";
					for(int j = 0; j < bapp; j++) {
						m[pc][pp[pc]++] = ba[j]; 
					}
					bapp = 0;
				}
				pc++;
				if(pc == N) {
					pc = 0;
				}
				
			}
			
			Arrays.sort(pp);
			for(int i = 0; i < N; i++) {
				System.out.print(pp[i]+" ");
			}
			System.out.println(bapp);
		}
	}
		
}