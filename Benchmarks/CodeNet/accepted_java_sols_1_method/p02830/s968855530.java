import java.util.*;
public class Main{
  public static void main(String[] args) {
    int n;
    String s,t;
    Scanner sc=new Scanner(System.in);
    n=sc.nextInt();
    s=sc.next();
    t=sc.next();
    for(int i=1;i<=n;i++){
      System.out.print(s.substring(i-1,i)+t.substring(i-1,i));
    }
  }
}
