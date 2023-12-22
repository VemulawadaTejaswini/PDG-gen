import java.util.*;
 
	public class Main {
		public static void main(String[] args) {
      	Scanner sc = new Scanner(System.in);
      
      	long N  =sc.nextLong();
       	long K  =sc.nextLong();
          
        if(N>K && N%K!=0){
           System.out.println(K-(N%K));
        }
          else if(N<K && K-N<N){
            System.out.println(K-N);
          }
          else if(N<K && K-N>N){
           System.out.println(N);
          }
          else{
          System.out.println(0);
          }
    }
}