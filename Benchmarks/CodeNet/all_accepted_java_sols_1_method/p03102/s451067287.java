import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int C = sc.nextInt();
        int B[] = new int[M];
        for(int i = 0; i < M; i++){
            B[i] = sc.nextInt();
        }

        int res = 0;
        for(int i = 0; i < N; i++){
            int tmp = 0;
            for(int j = 0; j < M; j++){
               int src = sc.nextInt();
               tmp += src * B[j];
            }
            if((tmp + C) > 0){
               res++;
            }
        }

        System.out.println(res);
    }

}