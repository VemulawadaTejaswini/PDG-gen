import java.util.*;

class Main{
  public static void main (String[] args) {
    Scanner sc = new Scanner(System.in);
    int A = sc.nextInt();
    int B = sc.nextInt();
    int C = sc.nextInt();
    String ans = "Yes";
    if (A == B && B==C){
      ans = "No"; 
    }else if (A != B && B!= C && C != A){
      ans = "No"; 
    }
    System.out.println(ans);
  }
}