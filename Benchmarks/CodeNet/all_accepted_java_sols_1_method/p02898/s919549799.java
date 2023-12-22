import java.util.*;

public class Main {
	public static void main(String[] args) {
	
   Scanner sc = new Scanner(System.in);
   
     int N = sc.nextInt();
     int K = sc.nextInt();
     Integer h[] = new Integer[N];
     
     int a = 0;
     
     for(int i=0; i<N; i++) {
    	 h[i] = sc.nextInt();
    	 if(h[i] >= K) {
    		 a++;
    	 }
     }
     System.out.println(a);
   }
}
