import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        String res = "";
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'B') {
                if (res.equals("")) {
                    continue;
                }
                res = res.substring(0, res.length() - 1);
            } else {
                res += String.valueOf(s.charAt(i));
            }
        }
        System.out.println(res);
        sc.close();
    }
}