import java.util.*;

class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int r = stdIn.nextInt();
		int c = stdIn.nextInt();
		int[][] A = new int[r][c];
		int[] b = new int[r];
		int[] b2 = new int[c];
		int sum = 0;
		for (int i=0; i<r; i++) {
			for (int j=0; j<c; j++) {
				int x = stdIn.nextInt();
				A[i][j] = x;
				b[i] += x;
				b2[j] += x;
				sum += x;
			}
		}
		for (int i=0; i<r+1; i++) {
			if(i<r)
				for (int j=0; j<c+1; j++) {
					if(j<c)
						System.out.print(A[i][j]+" ");
					else
						System.out.println(b[i]);
				}
			else
				for (int k=0; k<c; k++) {
					System.out.print(b2[k]+" ");
				}
		}
		System.out.println(sum);
	}
}