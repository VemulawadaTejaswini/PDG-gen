import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 0;
        String t = "+";
        String s = sc.next();

        for (int i = 0; i < 4; i++) {
            if (t.equals(s.substring(i,i + 1))) {
                n = n + 1;
            } else {
                n = n - 1;
            }

        }
        System.out.println(n);

    }
}

