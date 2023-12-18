import java.util.*;

public class Main {
	public static void main(String[] args){
      try{
        Scanner sc = new Scanner(System.in);
        int  N = sc.nextInt();
        int  K = sc.nextInt();

        int A[] = new int[N];
        for(int i=0; i < N; i++){
        	A.add(sc.nextInt());
        }

        int result[] = new int[N];
        Arrays.fill(result, 0);
        
        for(int i=0; i < K; i++){
            for(int a_i =0; a_i < N; a_i++){
              int p = A[a_i];
              int x = a_i - p;
              int y = a_i + p;
              if(x < 0)
                x =0;
              if(y > N -1)
                y = N - 1;

              for( int j =x; j <= y; j++){
                result[j] = result[j] + 1;
              }
          }
          A=result.clone();
        }
        for(int l =0; l < N; l++){
        	System.out.print(result[l] + " ");
        }
      } catch (Exception e){
          System.out.print(e);
      }
    }
}
