import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		try(Scanner sc = new Scanner(System.in)) {
			
			int h = sc.nextInt();
			int w = sc.nextInt();
			int k = sc.nextInt();
			
			int[][] table = new int[h][w];
			
			for(int i = 0 ; i < h ; i++ ) {
				String s = sc.next();
				
				for(int j = 0 ; j < s.length(); j++ ) {
					table[i][j] = s.charAt(j) == '.' ? 0 : 1;
				}
			}
			
//			for(int i = 0 ; i < h ;i++ ) {
//				for(int j = 0 ; j < w ; j++ ) {
//					System.out.print(table[i][j]);
//				}
//				System.out.println();
//			}
			
			//consider all case
			int maxRows = (int)Math.pow(2, h);
			int maxCols = (int)Math.pow(2, w);
			
			int ans = 0;
			
			for(int i = 0 ; i < maxRows ; i++ ) {
				
				List<Integer> restRows = new ArrayList<>();
				for(int l = 0 ; l < h ; l++ ) {
//					System.out.println((i >> l) & 1);
					if ( ((i >> l) & 1) == 1 ) {
						restRows.add(l);
					}
				}
//				System.out.println(i & 1);
//				System.out.println((i >> 1) & 1);
//				System.out.println((i >> 2) & 1);
//				System.out.println(i >> 3 & 1);
//				System.out.println(i >> 4 & 1);
//				System.out.println(i >> 5 & 1);				
//				System.out.println("----");
				
				for(int j = 0 ; j < maxCols ; j++ ) {
					List<Integer> restCols = new ArrayList<>();

					for(int l = 0 ; l < w ; l++ ) {
//						System.out.println((j >> l) & 1);
						if ( ((j >> l) & 1) == 1 ) {
							restCols.add(l);
						}
					}
//					System.out.println("----");
					//check blacks
					int count = 0;
					for(int y = 0 ; y < h ; y++ ) {
						if ( !restRows.contains(y) ) continue;
						for(int x = 0 ; x < w ; x++ ) {
							if ( restCols.contains(x)) {
								if ( table[y][x] == 1) {
									count++;
								}
							}
						}
					}
					
					if ( count == k ) {
//						System.out.println(i + " x " + j);
						ans++;
					}
				}
			}
			
			System.out.println(ans);
		}
	}

}