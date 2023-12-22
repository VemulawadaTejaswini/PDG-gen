import java.util.Scanner;

public class Main{
	public static void main(String[] args){
		Scanner in = new Scanner(System.in);
		int H,W;
		
		H = in.nextInt();
		W = in.nextInt();
		
		while(H!=0 || W!=0){
			/*
			char[][] sharps = new char[H][W];
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					sharps[i][j] = '#';
				}
			}
			*/
			for(int i=0; i<H; i++){
				for(int j=0; j<W; j++){
					System.out.print('#');
				}
				System.out.println();
			}
			System.out.println();
			H = in.nextInt();
			W = in.nextInt();
		}
	}
}