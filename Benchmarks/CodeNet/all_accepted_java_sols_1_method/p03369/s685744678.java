import java.util.Scanner;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.next();
    String a = s.substring(0, 1);
    String b = s.substring(1, 2);
    String c = s.substring(2, 3);
    int ans = 700;
    if(a.equals("o")) {
    	ans += 100;
    }
    if(b.equals("o")) {
    	ans += 100;
    }
    if(c.equals("o")) {
    	ans += 100;
    }
    System.out.println(ans);
  }
}