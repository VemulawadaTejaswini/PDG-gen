import java.util.*;
import java.util.Arrays;


public class Main{
  
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int L = sc.nextInt();
    String [] x = new String[N];
    for(int i=0;i<N;i++){
      x[i] = sc.next();
      
    }
    Arrays.sort(x);
    String ans = "";
    for(int i=0;i<N;i++){
      ans += x[i];
    }

    
    System.out.println(ans);
    
    
  }
}
                          
                         
                    
    
    
    
    
    
    
