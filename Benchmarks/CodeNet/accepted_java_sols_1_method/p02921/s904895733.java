import java.util.Scanner;
public class Main {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String S = scan.next();
    String T = scan.next();
    int ans = 0;
    char s[] = S.toCharArray();
    char t[] = T.toCharArray();
    for(int i=0; i<3; i++){
      if(s[i] == t[i])
        ans++;
    }
    System.out.println(ans);
  }
}