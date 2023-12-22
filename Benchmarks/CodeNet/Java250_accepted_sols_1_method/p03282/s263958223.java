import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String str = sc.next();
    long k = Long.parseLong(sc.next());
    char[] ch = new char[str.length()];
    for(int i = 0; i < str.length(); i++) ch[i] = str.charAt(i);
    int count = 0;
    char ans = str.charAt(0);
    while(count < k) {
      if(ch[count] == '1') {
        count++;
      } else {
        ans = ch[count];
        break;
      }
    }
    System.out.println(ans);
  }
}
