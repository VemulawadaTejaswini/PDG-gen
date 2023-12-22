import java.util.*;

public class Main{

	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
      
        long[] hp = new long[N];
      
        for(int i = 0; i < N; i++){
          hp[i] = sc.nextInt();
        }
      
        Arrays.sort(hp);
        
        long ans = 0;
        for(int j = 0; j < N-K; j++){
          ans += hp[j];
          
        }
        System.out.println(ans);
        
      
	}

}



