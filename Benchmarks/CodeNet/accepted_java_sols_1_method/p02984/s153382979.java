import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		// 整数の入力
		int N = sc.nextInt();
      int[] A = new int[N];
      long[] sum = new long[N+1];
      sum[0]=0;
for(int i=0;i<N;i++){
  A[i]=sc.nextInt();
  if(i%2==0){
	  sum[i+1]=sum[i]+A[i];
  }else{
      sum[i+1]=sum[i]-A[i];
  }
}
for(int j=0;j<N;j++){
  if(j%2==0){
  System.out.print((sum[N]-2*sum[j])+" ");
  }else{
    System.out.print((2*sum[j]-sum[N])+" ");
  }

}
      

      



    }
  
}
