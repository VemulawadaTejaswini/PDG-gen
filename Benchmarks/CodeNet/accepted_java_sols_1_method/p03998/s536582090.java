import java.util.Scanner;

/**
 * B
 */
public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String Sa = sc.nextLine();
        String Sb = sc.nextLine();
        String Sc = sc.nextLine();

        char ch = Sa.charAt(0);
        int a = 1;
        int b = 0;
        int c = 0;
        String ans = "";
        while (true) {
            if (ch == 'a') {
                if (a == Sa.length()) {
                    ans = "A";
                    break;
                }
                ch = Sa.charAt(a);
                a++;
            } else if (ch == 'b') {
                if (b == Sb.length()) {
                    ans = "B";
                    break;
                }
                ch = Sb.charAt(b);
                b++;
            } else {
                if (c == Sc.length()) {
                    ans = "C";
                    break;
                }
                ch = Sc.charAt(c);
                c++;
            }
        }

        System.out.println(ans);
        sc.close();
    }
}