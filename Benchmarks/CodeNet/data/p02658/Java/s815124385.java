import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
      int N=sc.nextInt();
      long[] A=new long[N];
      long x=1;
      for(int i=0;i<N;i++){
      	A[i]=sc.nextLong();
        x=x*A[i];
      }
      if(x<=1000000000000000000L){
      	System.out.println(x);
      }else{
      	System.out.println(-1);
      }
	}
}