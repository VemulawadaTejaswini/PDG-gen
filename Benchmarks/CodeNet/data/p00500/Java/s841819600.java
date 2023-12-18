import java.util.Scanner;
public class AOJ0577 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[][] a = new int[3][n];
        for(int i=0;i<n;i++) {
            for(int j=0;j<3;j++) {
                a[j][i] = sc.nextInt();
            }
        }
        int[] score = new int[n];
        for(int k=0;k<3;k++) {
            for(int i=0;i<n;i++) {
                boolean flag = true;
                for(int j=0;j<n;j++) {
                    if (i == j) {
                        continue;
                    }
                    if (a[k][i] == a[k][j]) {
                        flag = false;
                        break;
                    }
                }
                if (flag) {
                    score[i] += a[k][i];
                }
            }
        }
        for(int i=0;i<n;i++) {
            System.out.println(score[i]);
        }
    }
}