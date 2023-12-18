import java.util.Scanner;
class Main {
	int[][] s = new int [5][11];
	int[][] t = new int [5][11];
	int[][] c = new int [5][11];
	int[][] d = new int [5][11];
	int n = 0, b = 0, f = 0, r = 0, v = 0, i = 0, k = 0;
	public void of() {
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		for(i = 1; i <= n; i++) {
			b = sc.nextInt();
			f = sc.nextInt();
			r = sc.nextInt();
			v = sc.nextInt();
			switch(b) {
				case 1:
					s[f][r] += v;
					break;
				case 2:
					t[f][r] += v;
					break;
				case 3:
					c[f][r] += v;
					break;
				case 4:
					d[f][r] += v;
					break;
				default:
					break;
			}
		}
		
		for(n = 1; n <= 4; n++) {
			for(i = 1; i < 4; i++) {
				for(k = 1; k < 11; k++) {
					switch(n) {
						case 1:
							System.out.printf(" %d",s[i][k]);
							break;
						case 2:
							System.out.printf(" %d",t[i][k]);
							break;
						case 3:
							System.out.printf(" %d",c[i][k]);
							break;
						case 4:
							System.out.printf(" %d",d[i][k]);
							break;
						default:
							break;
					}
				}
				System.out.println();
			}
			if(n < 4) {
			System.out.println("####################");
			}
		}
	}
	public static void main(String[] args) {
		new Main().of();
	}
}