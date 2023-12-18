import java.util.*;

public class Main {
	  public static void main(String args[]){
      	Scanner scan = new Scanner(System.in);
            
        int N = scan.nextInt();
        int Ti[] = new int[N];
        
        int cost_now;
        int cost_sum = 0;
        
        for( int i = 0 ; i < N ; i++){
          Ti[i] = scan.nextInt();
          cost_sum += Ti[i];
        }
        
        int M = scan.nextInt();
        
        int Pm[] = new int[M];
        int Xm[] = new int[M];
        
        for( int i = 0 ; i < M ; i++){
          Pm[i] = scan.nextInt();
          Xm[i] = scan.nextInt();
        }
        
        for( int i = 0 ; i < M ; i++ ){
          cost_now = cost_sum;
          /*
          for( int j = 0 ; j < N ; j++){
            if(Pm[i]-1 == j)cost_now += Xm[i];
            else cost_now += Ti[j];
          }
          */
          cost_now = cost_now - Ti[ Pm[i]-1 ] + Xm[i];
          
          System.out.println(cost_now);
        }
        
	  }
}