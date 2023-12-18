import java.util.*;
public class Main {
 public static void main(String...args) {
   final Scanner sc = new Scanner(System.in);
   final int N = sc.nextInt();
   final char[] s = sc.next().toCharArray();
   int cnt = 0;
   for(int i = 0; i < N; i++)
     if(s[i] == 'R') cnt++;
   System.out.println(cnt * 2 > N ? "Yes" : "No");
 }
}