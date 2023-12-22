import java.util.*;

class Main{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
      int A = sc.nextInt();  //  1
      int B = sc.nextInt();  //  0
      int C = sc.nextInt();  // -1
      int K = sc.nextInt();  // 選ぶ枚数
      int max = -100;
      
      if ( A >= K){
      	System.out.println(K);
      }
      else{
        int L = K - A;
     	 if ( B >= L){
        	System.out.println(A);
      	}
      	else
      	{
      		System.out.println(1*A + 0*B+ (L-B)*(-1) );
      	}
      }
    }
}