import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        char[] ch = sc.next().toCharArray();
        for (int i = a - 1 ; i < c - 1 ; i++) {
            if (ch[i] == '#' && ch[i + 1] == '#') {
                System.out.println("No");
                return;
            }
        }
        for (int i = b - 1 ; i < d - 1 ; i++) {
            if (ch[i] == '#' && ch[i + 1] == '#') {
                System.out.println("No");
                return;
            }
        }

        if (c > d) {
            for (int i = b - 1 ; i < d; i++) {
                if (ch[i - 1] == '.' && ch[i] == '.' && ch[i + 1] == '.') {
                    System.out.println("Yes");
                    return;
                }
            }
            System.out.println("No");
            return;
        }

        System.out.println("Yes");

    }

}
