import java.util.*;

public class Main{
  
  public static void main(String[] args){
    
    Scanner sc = new Scanner(System.in);
    
    int D = sc.nextInt();
    int N = sc.nextInt();
    int d = (int)Math.pow(100,D);
    
    if(D == 0 && N != 100){
      System.out.println(1*N);  
    }else if(D == 0 && N == 100){
      System.out.println(1*N + 1);  
    }else if(D >= 1 && N != 100){
      System.out.println(d*N); 
    }else if(D == 1 && N == 100){
      System.out.println(d*N + 100); 
    }else if(D == 2 && N == 100){
      System.out.println(d*N + 10000);  
    }    
  }  
}