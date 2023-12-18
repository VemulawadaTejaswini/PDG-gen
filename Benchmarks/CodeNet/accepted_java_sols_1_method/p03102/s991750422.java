import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int M = sc.nextInt();
    int C = sc.nextInt();
    int counter = 0;
   	int B[] = new int[M];
    
    for(int i=0; i<M; i++) {
      B[i] = sc.nextInt();
    }
    
    for(int j=0; j<N; j++) {
      int total = C;
      for(int k=0; k<M; k++) {
        total += sc.nextInt() * B[k];
      }
      if(total > 0) {
        counter++;
      }
    }
    System.out.println(counter);
  }
}
