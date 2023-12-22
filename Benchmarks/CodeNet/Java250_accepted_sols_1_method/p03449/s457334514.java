import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[][] = new int[2][N];
        long ans = 0;
        int tmp=0;
        long result0 = 0;
        long result1 = 0;
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < N; j++) {
                A[i][j] = sc.nextInt();
            }
        }
            for(int i=0;i<N;i++){
                int j=0;
                tmp=0;
                while(j<=i){
                  tmp+=A[0][j];
                  j++;
                }
                int k=i;
                while(k<N){
                    tmp+=A[1][k];
                    k++;
                    
                }
                    ans=Math.max(ans,tmp);
                }
        System.out.println(ans);
    }
}