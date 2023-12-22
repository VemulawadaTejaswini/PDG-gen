import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            String t = sc.next().replaceAll("-", "");
            String a = "" + t.charAt(0);
            for (int i = 1; i < t.length(); i += 2) {
                if (a.indexOf(t.charAt(i + 1)) == -1) {
                    if (t.charAt(i) == '>') {
                        a += t.charAt(i + 1);
                    } else {
                        a = t.charAt(i + 1) + a;
                    }
                }
            }
            System.out.println(a);
        }
    }
}
