import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner s = new Scanner(System.in);
		
		int r = s.nextInt();
		int c = s.nextInt();
		int[][] yousoA = new int[r][c];
		int[] yousoB = new int[r];
		int[] yousoB2 = new int[c];
		int sum = 0;
		
		for(int i = 0; i < r; i++){
			for(int j = 0; j < c; j++){
				int x = s.nextInt();
				yousoA[i][j] = x;
				yousoB[i] += x;
				yousoB2[j] += x;
				sum += x;
			}
		}
		for(int i=0; i < r+1; i++){
			if(i < r)
				for(int j =0; j < c+1; j++){
					if(j < c) System.out.print(yousoA[i][j] + " ");
					else System.out.println(yousoB[i]);
				}
			else
				for(int k = 0; k < c; k++){
					System.out.print(yousoB2[k] + " ");
				}
		}
		System.out.println(sum);
		s.close();
	}
}
