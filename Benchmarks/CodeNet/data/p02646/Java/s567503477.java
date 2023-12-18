import java.util.*;

public class Main{
  public static void main(String[] main){
    Scanner sc = new Scanner(System.in);
    long A = sc.nextLong();
    long V = sc.nextLong();
    long B = sc.nextLong();
    long W = sc.nextLong();
    long T = sc.nextLong();
    
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
    