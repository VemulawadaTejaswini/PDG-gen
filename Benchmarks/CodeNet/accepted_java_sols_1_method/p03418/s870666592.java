import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        long N = sc.nextInt();
        long K = sc.nextInt();
        long cnt =0;
        long sho =0;
        long kari;
        if(K==0)
          cnt = N*N;
        else{
          for(long b=K+1;b<=N;b++){
            sho = N/b;
            kari = (b-K)*sho;
            if(N<sho*b+K)
              cnt += kari;
            else
              cnt += kari + N + 1 -(sho * b) - K;
          }
        }
        System.out.println(cnt);  
	}
}