import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		
		int[][][] room = new int[4][3][10];
		
		
		for(int i = 1;i <= n;i++) {
			
			int tou = sc.nextInt();
			int kai = sc.nextInt();
			int hidari = sc.nextInt();
			int addnum = sc.nextInt();
			
			room[tou-1][kai-1][hidari-1] = room[tou-1][kai-1][hidari-1] + addnum;
			
			
		}
		
		
		for(int j = 0;j < 4;j++) {
			for(int k = 0;k < 3;k++) {
				for(int l = 0;l < 10;l++) {
					System.out.print(" " + room[j][k][l]);
				}
				
				System.out.println("");
				System.out.println("");
			}
			
			if(j != 3) {
				System.out.println("####################");
				
				System.out.println("");
				
				
			}
			
		}
			
		}

		

}
