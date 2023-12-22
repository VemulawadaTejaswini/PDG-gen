import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
      	int K = sc.nextInt();
      	int Q = sc.nextInt();
      	
      	int[] b = new int[N];	
      
      for(int i=0;i<Q;i++){
        int win = sc.nextInt();
        b[win-1] = b[win-1] + 1;
       }
      
      for(int i=0;i<N;i++){
      
        if(b[i]>Q-K){
          System.out.println("Yes");
        }else{
          System.out.println("No");
        }
      }
      
	}
}