import java.util.*;
public class Main{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    char[] s = sc.next().toCharArray();
    sc.close();
    int ans = 0;
    char b = s[0];
    for (char i:s){
      if (b != i){
        ans++;
        b = i;
      }
    }
    System.out.println(ans);
  }
}