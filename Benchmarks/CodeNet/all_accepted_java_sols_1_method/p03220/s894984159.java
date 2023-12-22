import java.util.*;
import java.util.Arrays;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int T = sc.nextInt();
    int A = sc.nextInt();
    int [] a = new int[N];
    double [] temp = new double[N];
    for(int i=0;i<N;i++){
      a[i] = sc.nextInt();
      temp[i] = (double)T-a[i]*0.006;
      
    }
    double min =1000.0;
    int ans = 0;
    double x;
    for(int i=0;i<N;i++){
      x = Math.abs(A-temp[i]);
      if(x<min){
        min = x;
        ans = i+1;
      }
    }
    System.out.println(ans);
  }
}
                          
                         
                    
    
    
    
    
    
    
