import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int K = sc.nextInt();
    String S = sc.next();
    String[] ss = S.split("");
    int j = 0;
    for (int i = 0; i < K; i++){
      System.out.print(ss[i]);
      j = i;
    }
    if (j <= K){
      System.out.print("...");
    }
  }
}