import java.util.*;

public class Main{
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    String[] S = sc.nextLine().split(" ");
    int r = Integer.parseInt(S[0]);
    int D = Integer.parseInt(S[1]);
    int x = Integer.parseInt(S[2]);
    
    int ans = x;
    for(int i = 0; i < 10; i++){
      ans = ans * r -D;
      System.out.println(ans);
    }
  }
}