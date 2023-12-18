import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int V = sc.nextInt();
    int B = sc.nextInt();
    int W = sc.nextInt();
    int T = sc.nextInt();
    
    for(int i=1; i<=T; i++){
      A += V;
      B += W;
      if(A==B){
       System.out.print("YES");
        return;
      }
    }
    System.out.print("NO");  
  }
}
    