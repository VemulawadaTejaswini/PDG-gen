import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int Q = scan.nextInt();

        int L[] = new int[M];
        int R[] = new int[M];
        int X[][] = new int[509][509];
        int C[][] = new int[509][509];
        int p,q,total;

        for(int i = 0; i < M; i++){
            L[i] = scan.nextInt();
            R[i] = scan.nextInt();
            X[L[i]][R[i]]++;
        }

        for(int i = 1; i < N+1; i++){
            for(int j = 1; j < N+1; j++){
                C[i][j] = C[i][j-1] + X[i][j];
            }
        }

        for(int i = 0; i < Q; i++){
            p = scan.nextInt();
            q = scan.nextInt();
            total = 0;
            for(int j = p; j < q+1; j++){
                total += C[j][q] - C[j][p-1];
            }
            System.out.println(total);
        }
    }
}