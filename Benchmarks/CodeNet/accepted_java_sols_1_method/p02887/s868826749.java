import java.util.*;
 
public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    String str = sc.next();
    char c[] = new char[n];
    int sum = 0;
    c = str.toCharArray();
    char ch = c[0];
    for(int i = 1; i < n; i++) {
      if(c[i] != ch) {
        ch = c[i];
        sum++;
      }
    }
    
    System.out.println(sum+1);
  }
}