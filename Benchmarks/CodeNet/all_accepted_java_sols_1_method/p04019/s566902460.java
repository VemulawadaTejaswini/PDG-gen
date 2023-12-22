import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 0, w = 0, s = 0, e = 0;

        String str = sc.nextLine();

        for (int i = 0, len = str.length(); i < len; i++) {
            char ch = str.charAt(i);

            n += ch == 'N' ? 1 : 0;
            w += ch == 'W' ? 1 : 0;
            s += ch == 'S' ? 1 : 0;
            e += ch == 'E' ? 1 : 0;
        }

        boolean isNsOk = (n == 0 && s == 0) || (n > 0 && s > 0);
        boolean isWeOk = (w == 0 && e == 0) || (w > 0 && e > 0);

        if (isNsOk && isWeOk) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
