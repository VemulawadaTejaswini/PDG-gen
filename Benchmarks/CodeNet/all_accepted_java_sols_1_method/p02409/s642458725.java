import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt(); // infomation amount
	
		int[][] b1 = new int[4][11];
		int[][] b2 = new int[4][11];
		int[][] b3 = new int[4][11];
		int[][] b4 = new int[4][11];
		
		for(int i = 0; i < n; i++){
			
			int b = scan.nextInt(); // tou
			int f = scan.nextInt(); // flor
			int r = scan.nextInt(); // room
			int v = scan.nextInt(); // ninzu
		
			if(b == 1){
				b1[f][r] += v;
				}else if(b == 2){
					b2[f][r] += v;
				}else if(b == 3){
					b3[f][r] += v;
				}else if(b == 4){
					b4[f][r] += v;
				}
		}
		
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print(" " + b1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("####################");
		
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print(" " + b2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("####################");
		
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print(" " + b3[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("####################"); 
		
		for(int i = 1; i <= 3; i++){
			for(int j = 1; j <= 10; j++){
				System.out.print(" " + b4[i][j]);
			}
			System.out.println();
		}
		
		
		
		
	}

}