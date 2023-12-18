import java.util.Scanner;

public class Main {

	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		
		int[][][] managementOffice = new int [4][3][10];
		for(int i= 0; i<4;i++){
			
			managementOffice[i] = createOffice();
		}
		
		
		int count  = Integer.parseInt(sc.next());
		for(int i = 0; i< count; i++){
			
			int b = Integer.parseInt(sc.next());
			int f = Integer.parseInt(sc.next());
			int r = Integer.parseInt(sc.next());
			int v = Integer.parseInt(sc.next());
			
			managementOffice[b-1][f-1][r-1] += v;
		}
		
		for(int i = 0; i <4 ;i++){
			for(int j = 0; j<3;j++){
				for(int k = 0; k<10;k++){
					
					System.out.print(" " +managementOffice[i][j][k]);
					
				}
				System.out.println();
				
			}
			if(i != 3){
				
				System.out.println("####################");
			}
			
		}
		
		sc.close();
		
	}
	
	
	private static int[][] createOffice(){
		
		int[][] office = new int[3][10];
		
		for(int i = 0; i < 3;i++){
			
			for(int j = 0; j < 10;j++){
				
				office[i][j] = 0;
			}
			
		}
		
		
		
		
		return office;
	}

}

