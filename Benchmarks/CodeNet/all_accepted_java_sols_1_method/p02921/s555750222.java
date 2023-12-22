import java.util.*;

public class Main {
  public static void main(String[] args) {
    @SuppressWarnings("resource")
    Scanner sc = new Scanner(System.in);
    char[] expected = sc.next().toCharArray();
    char[] actual = sc.next().toCharArray();
    int cnt = 0;
    
    for (int i = 0; i < 3; i++) {
      cnt = (expected[i] == actual[i]) ? cnt + 1 : cnt;
    }
    System.out.println(cnt);
  }
}