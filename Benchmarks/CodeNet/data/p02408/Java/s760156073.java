import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, x;
		String c;
		boolean dataS[] = new boolean[13];
		boolean dataH[] = new boolean[13];
		boolean dataC[] = new boolean[13];
		boolean dataD[] = new boolean[13];
		
		for(int i = 0; i < 13; i++) {
			dataS[i] = false;
			dataH[i] = false;
			dataC[i] = false;
			dataD[i] = false;
		}
		
		n = stdIn.nextInt();
		
		for( int i = 1; i <= n; i++) {
			c = stdIn.next();
			x = stdIn.nextInt();
			
			switch(c) {
			case "S":
				dataS[x - 1] = true;
				break;
			case "H":
				dataH[x - 1] = true;
				break;
			case "C":
				dataC[x - 1] = true;
				break;
			case "D":
				dataD[x - 1] = true;
				break;
			default:
				break;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 13; j ++) {
				switch(i) {
				case 0:
					if(dataS[j] == false) {
						System.out.println("S　" + (j + 1));
					}
					break;
				case 1:
					if(dataH[j] == false) {
						System.out.println("H　" + (j + 1));
					}
					break;
				case 2:
					if(dataC[j] == false) {
						System.out.println("C　" + (j + 1));
					}
					break;
				case 3:
					if(dataD[j] == false) {
						System.out.println("D　" + (j + 1));
						
					}
					break;
				default:
					break;
				}
			}
			
		}
		
	}
}
