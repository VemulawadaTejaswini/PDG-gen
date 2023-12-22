import java.util.*;

class Main {

	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
      int N =sc.nextInt();
      long A[] = new long[N];
      for(int i=0;i<N;i++){
        A[i] = sc.nextLong();
      }
      Arrays.sort(A);
      long ans = 1;
      for(int i=0;i<N;i++){
        if(ans==0) break;
        if(A[i]>(long)Math.pow(10,18)/ans){
          ans = -1;
          break;
        }
        ans*=A[i];
      }
      System.out.println(ans);
	}
}