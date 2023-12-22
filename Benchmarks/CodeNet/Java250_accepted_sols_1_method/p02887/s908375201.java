import java.util.*;

public class Main {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n = Integer.parseInt(sc.next());
    int count = 1;
    String str = sc.next();
    char ch, temp;
    temp = str.charAt(0);
    for(int i = 1; i < n; i++) {
      ch = str.charAt(i);
      if(ch != temp) {
        count++;
        temp = ch;
      }
    }
    System.out.println(count);
  }
}
