import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String S = sc.next();
        int a = 0;
        int b = 0;
        for (int i = 0; i < 3; i++) {
            if (S.charAt(i) == 'A') {
                a++;
            } else {
                b++;
            }
        }
        if (a == 3 || b == 3) {
            System.out.println("No");
        } else {
            System.out.println("Yes");
        }
    }

}
