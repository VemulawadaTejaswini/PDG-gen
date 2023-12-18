import java.util.Scanner;


public class Main {

	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int r = sc.nextInt();
		int c = sc.nextInt();
		
		long[][] cells = new long[r+1][c+1]; //+1は総和セル
		
		for(int tate = 0;tate < r;tate++) {
			for(int yoko = 0;yoko < c;yoko++) {
				
				long num = sc.nextLong();
				
				cells[tate][yoko] = num;  //すべてのセルに値を代入した
				
			}
		}
		
		for(int tate = 0;tate < r;tate++) {
			
			long yokosum = 0;
			
			
			for(int yoko = 0;yoko < c;yoko++) {
				yokosum = yokosum + cells[tate][yoko];
				
			}
			
			cells[tate][c] = yokosum;    //左の総和をセルに入れる
		
		
		}
		
		for(int yoko = 0;yoko <= c;yoko++) {
			
			
			long tatesum = 0;
			
			
			for(int tate = 0;tate < r;tate++) {
				tatesum = tatesum + cells[tate][yoko];
				
			}
			
			cells[r][yoko] = tatesum;   //上の総和をセルに入れる
			
			
		}
		
		for(int tate = 0;tate <= r;tate++) {
			for(int yoko = 0;yoko <= c;yoko++) {
				
				System.out.print(cells[tate][yoko]);
				
				if(yoko == c) {
					
				}else {
					System.out.print(" ");
				}
				
				
				
			}
			
		if(tate == r) {
					
				}else {
					System.out.println("");
					
				}
		}
		
		System.out.println("");
		

	}
	

}
