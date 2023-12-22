import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int H = sc.nextInt();
		int W = sc.nextInt();

		int h [] = new int [H];
		int w [] = new int [W];
		char grid [] [] = new char [H][W];
		
		
		for (int i=0; i<H; i++){
			String temp = sc.next();
			boolean hh = false;
			
			for (int j=0; j<W; j++){
				grid [i][j] = temp.charAt(j);
				if (temp.charAt(j)=='#'){
					hh=true;
					w[j]=1;
				}
			}
			
			if (hh)
				h[i]=1;
		} 
		
		for (int i=0; i<H; i++){
			
			for (int j=0; j<W; j++){
				if (h[i]==1 && w[j]==1)
					System.out.print(grid[i][j]);
			}
			
			if (h[i]==1)
				System.out.println();
		}	
		
		sc.close();
	}

}
