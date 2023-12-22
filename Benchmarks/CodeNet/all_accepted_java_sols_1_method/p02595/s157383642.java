import java.util.*;
public class Main {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    double d = sc.nextDouble();
    
    int count = 0;
    
    for(int i = 0 ; i < n ; ++i){
      long x = sc.nextLong();
      long y = sc.nextLong();
      double num = 0;
      
      num = Math.sqrt(x*x + y*y);

      if(num <= d){
        count++;
      }
    }
    
    System.out.println(count);
    
  }
}