import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Scanner scan = new Scanner(System.in);
    int N, K, X, Y;
    
    N = scan.nextInt();
    K = scan.nextInt();
    X = scan.nextInt();
    Y = scan.nextInt();
  
    int sa = N - K;
    int ans = 0;
    if(sa > 0){
    	ans = K * X + sa * Y;
    }
    else{
    	ans = N * X;
    }
    
    System.out.println(ans);
    
  }

}