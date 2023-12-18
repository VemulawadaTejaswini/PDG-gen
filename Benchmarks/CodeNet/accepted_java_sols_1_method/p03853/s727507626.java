import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        String[] s = new String[h];

        for (int i = 0; i < h; i++) {
            s[i] = sc.next();
        }

        sc.close();

        for (int i = 0; i < h; i++) {
            System.out.println(s[i]);
            System.out.println(s[i]);
        }

    }
}