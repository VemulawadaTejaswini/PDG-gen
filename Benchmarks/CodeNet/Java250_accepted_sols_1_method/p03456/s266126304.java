import java.util.*;
 
public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    double N = Double.parseDouble(S[0]+S[1]);
    int M = (int)Math.sqrt(N);
    String ans = (int)N == M*M ? "Yes" : "No";
    System.out.println(ans);
  }
}