import java.util.*;

class Main{
  public static void main(String[] args){
    try(Scanner sc = new Scanner(System.in)){
      int a = Integer.parseInt(sc.next());
      int b = Integer.parseInt(sc.next());
      int c = Integer.parseInt(sc.next());
      int d = Integer.parseInt(sc.next());
      String ans = "No";
      //a<b<cではないので絶対値
      if(Math.abs(c - a) <= d){
        ans = "Yes";
      }
      if((Math.abs(b - a) <= d) && (Math.abs(c - b) <= d)){
        ans = "Yes";
      }
      System.out.println(ans);
    }
  }
}
        