import java.util.Scanner;

	public class Main {

		public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			String[] S = new String[h];
			char[][] s = new char[h+2][w+2];
			
			for(int i=0;i<h;i++) {
				S[i] = sc.next();
				for(int j=0;j<w;j++) {
					s[i+1][j+1]=S[i].charAt(j);
				}
			}
			
			for(int i=1;i<h+2;i++) {
				for(int j=1;j<w+2;j++) {
					if(s[i][j]=='#') {
						if(s[i-1][j]!='#'&&s[i+1][j]!='#'&&s[i][j+1]!='#'&&s[i][j-1]!='#') {
							
							System.out.println("No");
							return;
						}
					}
				}
			}
			
			System.out.println("Yes");
			
			
			
			
		}
	}