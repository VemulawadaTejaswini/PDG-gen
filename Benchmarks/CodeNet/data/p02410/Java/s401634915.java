import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(), m = scan.nextInt();
        int i, j;
        int[][] A = new int[n][m];
        int[] b = new int[m];
        for(i = 0; i < n; i++){
            for(j = 0; j < m; j++){
                A[i][j] = scan.nextInt();
            }
        }
        for(j = 0; j < m; j++) b[j] = scan.nextInt();

        int sum;
        
        for(i = 0; i < n; i++){
            sum = 0;
            for(j = 0; j < m; j++){ sum += A[i][j] * b[j]; }
            System.out.println(sum);
        }
    }
}
