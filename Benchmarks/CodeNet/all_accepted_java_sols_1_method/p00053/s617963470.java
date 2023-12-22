import java.util.Arrays;
import java.util.Scanner;

public class Main{
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			boolean[] p = new boolean[104730];
			int[] s = new int[10001];
			int j = 0;
			s[j++] = 0;
			Arrays.fill(p, true);
			for(int i=2; i<104730; i++) {
				if(p[i]) {
					s[j] = s[j-1] + i;
					j++;
					for(int k=i*2; k<104730; k+=i) p[k] = false;
				}
			}
			
			while(true) {
				int n = sc.nextInt();
				if(n == 0) break;
				System.out.println(s[n]);
			}
		}
	}
}

