import java.util.*;

public class Main {
  
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int a = 0;
        int b = 0;
        int c = 0;
        for (char ch : S.toCharArray()) {
            switch(ch) {
            case 'a' : a++;
                       break;
            case 'b' : b++;
                       break;
            case 'c' : c++;
            }
        }
        int max = Math.max(Math.max(a, b), c);
        int limit = (S.length()+2)/3;
        System.out.println(limit < max ? "NO" : "YES");
    }
}
