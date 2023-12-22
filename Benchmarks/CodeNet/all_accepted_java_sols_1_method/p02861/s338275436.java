import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int x[] = new int[n];
    int y[] = new int[n];

    for(int i = 0 ; i < n ; ++i){
      x[i] = sc.nextInt();
      y[i] = sc.nextInt();
    }
    
    double sum = 0;
    
    for(int i = 0 ; i < n ; ++i){
      for(int j = i+1 ; j < n ; ++j){
        int xx= x[i]-x[j];
        int yy= y[i]-y[j];
        int r= xx*xx + yy*yy;
        sum += Math.sqrt(r);
      }      
 
    }

    System.out.println(sum * 2/n);
    
  }
}