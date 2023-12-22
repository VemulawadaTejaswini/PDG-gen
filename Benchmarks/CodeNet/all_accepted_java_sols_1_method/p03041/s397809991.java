import java.util.*;

public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int k = sc.nextInt();
    String s = sc.next();
    String s1[] = s.split("");
    s1[k-1] = s1[k-1].toLowerCase();
    for (int i = 0; i < n; i++){
      System.out.print(s1[i]);
    }
  }
}
