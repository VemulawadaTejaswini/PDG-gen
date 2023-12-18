
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        boolean n = false, w = false, s = false, e = false;
        for (char c : str.toCharArray()) {
            switch (c) {
                case 'N':
                    n = true;
                    break;
                case 'W':
                    w = true;
                    break;
                case 'S':
                    s = true;
                    break;
                case 'E':
                    e = true;
                    break;
            }
        }
        boolean ok = n == s && w == e;
        System.out.println(ok ? "Yes" : "No");
    }
}
