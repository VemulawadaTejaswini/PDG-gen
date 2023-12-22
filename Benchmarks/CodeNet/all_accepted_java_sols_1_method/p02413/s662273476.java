import java.util.*;

public class Main {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		int n = sc.nextInt();
		int m = sc.nextInt();
		int[][] ints = new int[n][m];
		int[] line = new int[n];
		int[] row = new int[m]; 
		int sum = 0;
		for (int i=0; i<n; i++) {
			for (int j=0; j<m; j++) {
				 int temp = Integer.parseInt(sc.next());
				 ints[i][j] = temp;
				 line[i] += temp;
				 row[j] += temp;
			}
			sum += line[i];
		}
		
		for (int i=0; i<n+1; i++) {
			for (int j=0; j<m+1; j++) {
				if (i==n && j==m) {System.out.print(sum);}
				else if (j==m) {System.out.print(line[i]);}
				else if (i==n) {System.out.print(row[j]);}
				else {System.out.print(ints[i][j]);}
				if (j!=m) {System.out.print(" ");}
			}
			System.out.println();
		}
	}
}
