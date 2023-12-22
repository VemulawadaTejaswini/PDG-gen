import java.util.Scanner;
        
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] arrayD = new int[k];
        int[][] arrayA = new int[k][n];

        for (int i = 0; i < k; i++) {
            arrayD[i] = sc.nextInt();
            for (int j = 0; j < n; j++) {
                if (j < arrayD[i]) {
                    arrayA[i][j] = sc.nextInt();
                } else {
                    arrayA[i][j] = 0;
                }
            }
        }
        
        int[] arrayAnswer = new int[n];
        for (int i = 0; i < k; i++) {
            for (int j = 0; j < n; j++) {
                if (arrayA[i][j] != 0) {
                    arrayAnswer[arrayA[i][j] - 1] = 1;
                }
            }
        }

        int count = 0;
        for (int i = 0; i < n; i++) {
            if(arrayAnswer[i] == 0) {
                count++;
            }
            
        }
        System.out.println(count);
    }
}