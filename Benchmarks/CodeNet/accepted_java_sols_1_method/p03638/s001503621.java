import java.util.*;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int w = sc.nextInt();
		int n = sc.nextInt();
		int[] colors = new int[n];

		int[][] square = new int[h][w];
		int height = 0;
		int width = 0;
		
		for(int i=0; i<colors.length; i++) {
			colors[i] = sc.nextInt();
			
			for(int j=0; j<colors[i]; j++) {
				if(height%2 ==0) {
					square[height][width] = i+1;
				}else {
					square[height][w - width -1] = i+1;
				}
				width += 1;
				if(width == w) {
					height += 1;
					width = 0;
				}
			}
		}
		
		sc.close();
		
		for(int[] row : square) {
			for(int color : row) {
				System.out.print(color + " ");
			}
			System.out.println();
		}	

	}

}