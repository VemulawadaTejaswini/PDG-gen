import java.util.*;

public class Main {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		for (int k = 0; k < n; k++) {
		    char[] arrA = sc.next().toCharArray();
		    char[] arrB = sc.next().toCharArray();
		    int a = arrA.length;
		    int b = arrB.length;
		    int[][] counts = new int[a + 1][b + 1];
		    for (int i = 1; i <= a; i++) {
		        for (int j = 1; j <= b; j++) {
		            if (arrA[i - 1] == arrB[j - 1]) {
		                counts[i][j] = counts[i - 1][j - 1] + 1;
		            } else {
		                counts[i][j] = Math.max(counts[i - 1][j], counts[i][j - 1]);
		            }
		        }
		    }
		    sb.append(counts[a][b]).append("\n");
		}
		System.out.print(sb);
	}
}

