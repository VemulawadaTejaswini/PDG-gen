import java.util.*;
public class Main {
	public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        int kinds[] = new int[M];  

        for (int i = 0; i < N; i++){

            int K = sc.nextInt();
            
          for (int j = 0; j < K; j++){
              int tmp = sc.nextInt() - 1;
              kinds[tmp]++;
            }

        }

        int count = 0;

        for (int i = 0; i < M; i++){

            if (kinds[i] == N) {
                count++;
            }

        }
        System.out.println(count);
     }
}