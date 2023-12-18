import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int C[] = new int [N-1];
    int S[] = new int [N-1];
    int F[] = new int [N-1];
    
    for(int i=0; i<N-1; i++){
      C[i]=sc.nextInt();
      S[i]=sc.nextInt();
      F[i]=sc.nextInt();
    }
    
    for(int i=0; i<N-1; i++){
      int time = S[i] + C[i];
      for(int j=i+1; j<N-1; j++){
        
        if(S[j] > time){
          time = S[j];
        }
        
        if(time % F[j] != 0){
            time += F[j] -(time % F[j]);
        }
        time += C[j];
      }
      System.out.println(time);
    }
    System.out.println(0);
  }
}
    
