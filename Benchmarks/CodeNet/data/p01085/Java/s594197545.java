import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            int m = sc.nextInt();
            int nmin = sc.nextInt(), nmax = sc.nextInt();
            if(m==0) break;
            int[] score = new int[m];

            for (int i = 0; i < m; i++) {
                score[i] = sc.nextInt();
            }

            Arrays.sort(score);

            int max = 0, j = 0;
            for (int i = m-nmin; i >= m-nmax; i--) {
                if(max <= score[i] - score[i-1]){
                    max = score[i] - score[i-1];
                    j = m - i;
                }
            }
            System.out.println(j);
        }
    }
}