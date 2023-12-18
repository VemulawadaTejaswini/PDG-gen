import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n = stdIn.nextInt();
		boolean[][] k = new boolean[4][13];
		for(int i = 0 ; i < n; i++) {
			String tmp = stdIn.next();
			int a = stdIn.nextInt();
			if(tmp.equals("S")) {
				k[0][a-1] = true;
			}
			if(tmp.equals("H")) {
				k[1][a-1] = true;
			}
			if(tmp.equals("C")) {
				k[2][a-1] = true;
			}
			if(tmp.equals("D")) {
				k[3][a-1] = true;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				if(!k[i][j]) {
					switch(i) {
					case 0:System.out.println("S " + (j+1)); break;
					case 1:System.out.println("H " + (j+1)); break;
					case 2:System.out.println("C " + (j+1)); break;
					case 3:System.out.println("D " + (j+1)); break;
					}
				}
			}
		}
	}
	
}