import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    String a[] = sc.next().split("");
    String b[] = sc.next().split("");
    String c[] = sc.next().split("");
    System.out.println(a[a.length-1].equals(b[0]) && b[b.length-1].equals(c[0]) ? "YES" : "NO");
  }
}
