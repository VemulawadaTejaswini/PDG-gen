import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while (sc.hasNext()) {
            String s = sc.nextLine();
            String answer = "";
            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);
                if ('A' <= ch && ch <= 'Z') {
                    ch += 32;
                } else if ('a' <= ch && ch <= 'z') {
                    ch -= 32;
                }
                answer += ch;
            }
            System.out.println(answer);
        }
        sc.close();
    }
}
