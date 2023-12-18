import java.util.*;


class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    sc.close();
    
    int ans = a * n;
    if(b < ans){
      ans = b;
    }
    System.out.println(ans);
  }
}
      