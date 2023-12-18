import java.util.Scanner;


public class Main {
	

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		boolean[][] a = new boolean[4][13];
		int n = stdIn.nextInt();
		for(int i = 0; i < n; i++) {
			String p = stdIn.next();
			int v = stdIn.nextInt();
			
			switch(p) {
			case "S" : a[0][v-1] = true; break;
			case "H" : a[1][v-1] = true; break;
			case "C" : a[2][v-1] = true; break;
			case "D" : a[3][v-1] = true; break;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j++) {
				if(!a[i][j]) {
					switch(i) {
					case 0 : System.out.println("S " + (j + 1)); break;
					case 1 : System.out.println("H " + (j + 1)); break;
					case 2 : System.out.println("C " + (j + 1)); break;
					case 3 : System.out.println("D " + (j + 1)); break;
					}
				}
			}
		}
	}

}