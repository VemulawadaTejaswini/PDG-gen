import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); 
    double K = sc.nextInt();
    double tmpK = K;
    double sum = 0;
    for(double i = 1 ; i < N + 1; i++){
      int count = 0;
      while(K>i){
        K = K/2;
        count++;
        // System.out.println(K);    
      }
      // System.out.println("count::"+count); 
      // System.out.println(Math.pow(0.5,count)); 
      sum = sum  + (1 / (double)N) * Math.pow(0.5,count);
      // System.out.println(sum); 
      K = tmpK;
      count = 0;
      
    }
    System.out.println(sum);    
  
  }
}


