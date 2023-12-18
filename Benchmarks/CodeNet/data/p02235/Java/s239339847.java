import java.util.Scanner;

public class Main {

	
	
	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		s.nextLine();
		
		for (int i = 0; i < n; i++) { lcs(s.nextLine(), s.nextLine());	}
		
		s.close();
	}

	public static int max(int a, int b) { return (a >= b) ? a : b;	}
	
	public static void lcs(String s1, String s2) {	
		int rows = s1.length() +  1;
		int cols = s2.length() + 1;
		int max = 0;
		//int[] maxSpot = new int[2];
		int[][] t = new int[rows][cols];
		
		for (int r = 1; r < rows; r++) {
			for (int c = 1; c < cols; c++) {
				t[r][c] = max(t[r-1][c], t[r][c-1]);
				char a = s1.charAt(r - 1);
				char b = s2.charAt(c - 1);
				
				if (Character.compare(a, b) == 0) { t[r][c] = t[r - 1][c - 1] + 1; }			
				
				//max = max(max, t[r][c]);
			} 
		}
		System.out.println(t[rows - 1][cols - 1]);	
	}
	
}

