import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    String zz = String.valueOf('Z');
    String aa = String.valueOf('A');
    int ans = s.lastIndexOf(zz) - s.indexOf(aa) + 1;
    System.out.println(ans);
  }
}
