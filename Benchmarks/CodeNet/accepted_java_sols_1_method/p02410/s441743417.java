import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        int[][] A = new int[n][m];
        int[] b = new int[m];
        
        int[] sum = new int[n];
        int[] product = new int[m];
        int[] ans = new int[n];
        
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                A[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < b.length; j++) {
            b[j] = sc.nextInt();
        }
        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A[i].length; j++) {
                product[j] = A[i][j] * b[j];
                sum[i] += product[j];
            }
            ans[i] = sum[i];
        }
        for (int i = 0; i < ans.length; i++) {
            System.out.println(ans[i]);
        }
    }
}
