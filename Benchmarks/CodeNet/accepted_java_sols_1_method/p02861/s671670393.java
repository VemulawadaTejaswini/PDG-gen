import java.util.*;
public class Main {
    
  public static void main(String[] args){
      
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int x[] = new int[N];
    int y[] = new int[N];
    for(int i = 0; i < N; ++i){
        
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
      
    }
    double sum = 0;
    for(int i = 0 ; i < N; ++i){
        
      for(int j = i+1 ; j < N; ++j){
          
        int xx= x[i]-x[j];
        int yy= y[i]-y[j];
        int r= (int)Math.pow(xx, 2)+ (int)Math.pow(yy, 2);
        sum += Math.sqrt(r);
        
      }
      
    }
    System.out.println(sum * 2/N);
  }
}
