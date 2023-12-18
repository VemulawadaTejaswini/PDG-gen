import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		long N = sc.nextLong();
      long M = N;
     long max = N-1;
      long maxx = N;
     for(long i=2;i*i<=M;i++){
       if(M%i==0){
         maxx = M/i+i-2;
         if(maxx<max){
          max=maxx; 
         }
       }
     }
      System.out.println(max);
    }

}
