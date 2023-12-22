import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int A = Integer.parseInt(S[0]);
    int P = Integer.parseInt(S[1]);
    
    P += A*3;
    System.out.println(P/2);
  }
}