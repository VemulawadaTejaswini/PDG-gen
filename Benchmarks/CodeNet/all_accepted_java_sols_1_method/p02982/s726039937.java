import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int D = sc.nextInt();
        int[][] X = new int[N][D];
        double a = 0;
        int ans = 0;

        for(int i=0; i<N; i++){
            for(int j=0; j<D; j++){
                X[i][j] = sc.nextInt();
            }
        }
        for(int i=0; i<N-1; i++){
            for(int j=1; j<N-i; j++){
                for(int k=0; k<D; k++){
                    a += Math.pow(X[i][k]-X[i+j][k],2);
                }
                if(Math.sqrt(a)==(int)(Math.sqrt(a))){
                    ans += 1;
                } 
                a = 0;
            }
        }
        System.out.println(ans);
    }
}