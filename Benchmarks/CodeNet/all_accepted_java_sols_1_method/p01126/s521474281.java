import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		try(Scanner sc = new Scanner(System.in)) {
			while(sc.hasNext()) {
				int n = sc.nextInt();
				int m = sc.nextInt();
				int a = sc.nextInt();
				if(n+m+a == 0) break;
				
				int[][] amida = new int[1001][n+1];
				while(m-- != 0) {
					int h = sc.nextInt();
					int p = sc.nextInt();
					int q = sc.nextInt();
					amida[h][p] = q;
					amida[h][q] = p;
				}
				
				int b = a;
				for(int h=1000; h>0; h--) {
					if(amida[h][b] != 0) b = amida[h][b];
				}
				System.out.println(b);
			}
		}
	}
}

