import java.util.*;
public class Main{
  public static void main(String args[]){
    Scanner sc = new Scanner(System.in);
	int n = sc.nextInt();
    String s = sc.next();
    String ans = "No";
    if(n%2==0){
      String s1 = s.substring(0,n/2);
      String s2 = s.substring(n/2,n);
      if(s1.equals(s2))ans="Yes";
    }
    System.out.println(ans);
  }
}