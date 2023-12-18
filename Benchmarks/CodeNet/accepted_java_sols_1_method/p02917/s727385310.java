import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        // 整数の入力
        int N = sc.nextInt();
        int[] A = new int[N+1];
        int now = 0;
        int Bkm = sc.nextInt();
        A[1] = Bkm;
        for(int k=2; k<N;k++){
            int Bk = sc.nextInt();
            A[k] = Math.min(Bkm, Bk);
            Bkm = Bk;
        }
        A[N] = Bkm;
        int sum = 0;
        for(int k=1;k<=N;k++){
            sum += A[k];
        }
        System.out.println(sum);
    }
}
