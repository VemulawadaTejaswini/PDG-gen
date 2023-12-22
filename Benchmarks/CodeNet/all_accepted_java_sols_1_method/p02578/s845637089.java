import java.util.*;
public class Main {
	public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int N = sc.nextInt();
      long[] A = new long[N];
      long ans = 0;
      for(int i=0;i<N;i++){
        A[i] = sc.nextLong();
        if(i>0 && A[i]<A[i-1]){
          ans+=A[i-1]-A[i];
          A[i] = A[i-1];
        }
      }
        System.out.println(ans);
    }
}
