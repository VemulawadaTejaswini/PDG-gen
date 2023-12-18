import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");
        for (int i = 0; i < s.length; i++) {
            if (s[i].equals("U")
                    || s[i].equals("D")
                    || (i % 2 == 0 && s[i].equals("R"))
                    || (i % 2 == 1 && s[i].equals("L"))) {
                continue;
            }
            System.out.println("No");
            return;
        }
        System.out.println("Yes");
    }
}

