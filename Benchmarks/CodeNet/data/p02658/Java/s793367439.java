import java.util.*;
public class Main {
	public static void main(String[] arags) {
      Scanner sc = new Scanner(System.in);
      int N=sc.nextInt();
      long[] B=new long[100000];
      long C=1L;
      
      if(N<2){
      	C=-1L;
      }else{
      	for(int i=0;i<N;i++){
      	B[i]=sc.nextLong();
        C=C*B[i];
        if(C>1000000000000000000L){
        	C=-1;
            break;
        }
      }     
            
      }   
      System.out.println(C);  
    }
}