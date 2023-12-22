import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S  = sc.nextLine().split(" ");
    long A = Integer.parseInt(S[0]);
    long B = Integer.parseInt(S[1]);
    long C = Integer.parseInt(S[2]);
    long sum = A * B * C;
    
    long ansA = (sum - (B * C * (A / 2))) - (B * C * (A / 2));
    long ansB = (sum - (C * A * (B / 2))) - (C * A * (B / 2));
    long ansC = (sum - (A * B * (C / 2))) - (A * B * (C / 2));
    
    long ans = (Math.min(ansA, Math.min(ansB, ansC)));
    System.out.println(ans);
  }
}