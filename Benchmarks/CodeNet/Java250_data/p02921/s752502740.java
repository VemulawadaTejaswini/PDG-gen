import java.util.*;
class Main {
public static void main(String[] args) {
Scanner sc = new Scanner(System.in);
  String str = sc.next();
  String str1 = sc.next();
  int cnt = 0;
  for(int i = 0; i<str.length(); i++) {
  char c = str.charAt(i);
    char c1 = str1.charAt(i);
    if(c==c1) cnt++;
  }
  System.out.println(cnt);
}
}