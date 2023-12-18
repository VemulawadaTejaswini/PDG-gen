import java.util.*;

public class Main {
	public static void main(String[] arags) {
      Scanner sc = new Scanner(System.in);
      int N=sc.nextInt();
      long[] A=new long[100000];
      long C=1L;
      
      for(int i=0;i<N;i++){
      	A[i]=sc.nextLong();
      }
      
      for(int i=0;i<N;i++){
      	C=C*A[i];
        if(C>1000000000000000000L){
        	C=-1;
        }
      }
            
      System.out.println(C);
    
    }
}