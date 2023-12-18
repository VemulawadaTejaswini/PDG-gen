import java.util.Scanner;

public class Main {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		int n, b, f, r, v;
		int data1[][] = new int[3][10];
		int data2[][] = new int[3][10];
		int data3[][] = new int[3][10];
		int data4[][] = new int[3][10];
		
		for(int i = 0; i < 3; i++) {
			for(int j = 0; j < 10; j++) {
				data1[i][j] = 0;
				data2[i][j] = 0;
				data3[i][j] = 0;
				data4[i][j] = 0;
			}
		}
		
		n = scan.nextInt();
		
		for(int i = 1; i <= n; i++) {
			b = scan.nextInt();
			f = scan.nextInt();
			r = scan.nextInt();
			v = scan.nextInt();
			
			switch(b) {
			case 1:
				data1[f - 1][r - 1] = v; 
				break;
			case 2:
				data2[f - 1][r - 1] = v; 
				break;
			case 3:
				data3[f - 1][r - 1] = v; 
				break;
			case 4:
				data4[f - 1][r - 1] = v; 
				break;
			default:
				break;
			}
		}
		
		for( int i = 0; i < 4; i++) {
			for(int j = 0; j < 3; j++) {
				for(int k = 0; k < 10; k++) {
					switch(i) {
					case 0:
						System.out.print(" " + data1[j][k]);
						break;
					case 1:
						System.out.print(" " + data2[j][k]);
						break;
					case 2:
						System.out.print(" " + data3[j][k]);
						break;
					case 3:
						System.out.print(" " + data4[j][k]);
						break;
					default:
						break;
					}
				}
				System.out.println("");
			}
			if( i != 3) {
				for( int m = 0; m < 20; m++) {
					System.out.print("#");
				}
				System.out.println("");
			}
		}
		
		System.out.println("");
		
	}
}
