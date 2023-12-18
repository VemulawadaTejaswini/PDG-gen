import java.util.*;
 
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String S = sc.next();
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < S.length(); i++) {
            ans.append((char)('A'+(S.charAt(i)-'A'+N)%26));
        }
        System.out.println(ans.toString());
    }
}
