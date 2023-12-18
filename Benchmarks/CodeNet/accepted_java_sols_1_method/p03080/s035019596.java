import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    String s = sc.next();
    int l1 = s.replace("B", "").length();
    int l2 = n - l1;
    System.out.println(l1 > l2 ? "Yes" : "No");
  }
}