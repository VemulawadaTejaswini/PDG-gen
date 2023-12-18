import java.util.*;
import java.lang.*;
 
public class Main {
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    int x = sc.nextInt();
    
    int a[ ] = new int[x]; 
    
    for(int i=0; i<x; i++){
      a[i] =  sc.nextInt();
    }
    
    int min = Integer.MAX_VALUE;
    
    for(int j = -100; j <=100; j++) {
      
      int sum  = 0;

      for(int k=0; k<x; k++){
        sum = sum + (int)Math.pow(a[k]-j, 2);
      }
      
      if(sum<min){
        min = sum;
      }
    }
    
    System.out.println(min);
  }
}