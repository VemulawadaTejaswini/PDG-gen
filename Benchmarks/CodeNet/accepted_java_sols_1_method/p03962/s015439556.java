import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    int ans = 0;
    
    if(A == B && B == C){
      ans = 1;
    }else if(A == B || B == C || C == A){
      ans = 2;
    }else{
      ans = 3;
    }
    System.out.println(ans);
  }
}