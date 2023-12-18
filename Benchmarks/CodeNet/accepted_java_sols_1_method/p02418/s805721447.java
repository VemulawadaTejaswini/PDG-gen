import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();
        String S = line + line;
        char[] s = S.toCharArray();

        line = sc.nextLine();
        char[] p = line.toCharArray();

        int check = 0;

        point:
        for(int i = 0; i < s.length; i++) {
          if(s[i] == p[0]) {
            for(int j = 0; j < p.length; j++) {
              if(i + j == s.length) {
                break point;
              } else if(s[i + j] != p[j]) {
                break;
              } else if(j == p.length - 1) {
                check = 1;
                break point;
              }
            }
          }
        }

        if(check == 1) {
          System.out.println("Yes");
        } else {
          System.out.println("No");
        }
    }
}