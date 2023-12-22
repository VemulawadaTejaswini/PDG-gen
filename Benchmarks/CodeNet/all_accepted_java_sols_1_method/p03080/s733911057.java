import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        String S = scan.next();
        int R = 0, B = 0;
        for (int i = 0; i < N; i++) {
            if (S.charAt(i) == 'R') {
                R++;
            } else {
                B++;
            }
        }
        if (R > B) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
