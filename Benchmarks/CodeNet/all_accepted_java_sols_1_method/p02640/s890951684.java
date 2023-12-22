import java.util.*;
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int X = sc.nextInt();
    int Y = sc.nextInt();
    String ans = "Yes";
    if(Y%2==1){
      ans = "No";
    }
    if(X*2>Y || (Y-X*2)/2>X){
      ans = "No";
    }
      System.out.println(ans);
  }
}