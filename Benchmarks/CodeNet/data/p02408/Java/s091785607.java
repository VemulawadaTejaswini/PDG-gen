import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner stdIn = new Scanner(System.in);
		int n, x , a = 13;
		String c;
		boolean data[] = new boolean[52];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = false;
		}
		
		n = stdIn.nextInt();
		
		for( int i = 1; i <= n; i++) {
			c = stdIn.next();
			x = stdIn.nextInt();
			
			switch(c) {
			case "S":
				data[x - 1] = true;
				break;
			case "H":
				data[a + x - 1] = true;
				break;
			case "C":
				data[a * 2 + x - 1] = true;
				break;
			case "D":
				data[a * 3 + x - 1] = true;
				break;
			default:
				break;
			}
		}
		
		for(int i = 0; i < 4; i++) {
			for(int j = 1; j <= 13; j ++) {
				switch(i) {
				case 0:
					if(data[j - 1] == false) {
						System.out.println("S　" + j);
					}
					break;
				case 1:
					if(data[a + j - 1] == false) {
						System.out.println("H　" + j);
					}
					break;
				case 2:
					if(data[a * 2 + j - 1] == false) {
						System.out.println("C　" + j);
					}
					break;
				case 3:
					if(data[a * 3 + j - 1] == false) {
						System.out.println("D　" + j);
						
					}
					break;
				default:
					break;
				}
			}
			
		}
		
	}
}
