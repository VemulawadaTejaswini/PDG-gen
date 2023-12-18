import java.util.*;
import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int[][] townPlace = new int[N][2];
		for(int i = 0; i<N; i++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			townPlace[i][0] = x;
			townPlace[i][1] = y;
		}
		double totalLength = 0; 
		for( int j = 0; j < N; j++) {
			for (int k = 0; k < N; k++) {
				int x1 = townPlace[j][0];
				int y1 = townPlace[j][1];
				int x2 = townPlace[k][0];
				int y2 = townPlace[k][1];
				double length= Math.sqrt((x1 - x2)*(x1 - x2)+(y1 - y2)*(y1 - y2));
				totalLength = totalLength + length;
			}
		}
		
		System.out.println(totalLength/N);	
	}
}