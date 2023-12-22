import java.util.Scanner;
public class Main{
  public static void main(String[] arsgs){
    Scanner sc = new Scanner(System.in);
    int a = Integer.parseInt(sc.next());
    int b = Integer.parseInt(sc.next());
    int c = Integer.parseInt(sc.next());
    int count = 0;
    String ans  = "No";
    if((a == b) || (a == c) ||(b == c)){
      if(!(a ==b && a == c)){
        ans = "Yes";
      }
    }
    System.out.println(ans);
  }
}