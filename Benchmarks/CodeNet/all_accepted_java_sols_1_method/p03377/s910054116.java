import java.util.*;

class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int x = Integer.parseInt(sc.next());
    String ans = null;
    if(a + b >=  x){
      ans = "YES";
    }else{
      ans = "NO";
    }
    if(a > x){
      ans = "NO";
    }
    System.out.println(ans);
  }
}
      