import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        String S = sc.next();
        char[] ans = S.toCharArray();
        int A1 = 0;
        int A2 = 0;
        if ('-' == S.charAt(A)) {
            for (int i = 0; A > i; i++) {
                if (ans[i] == '0' || ans[i] == '1' || ans[i] == '2' || ans[i] == '3' || ans[i] == '4' || ans[i] == '5' || ans[i] == '6' || ans[i] == '7' || ans[i] == '8' || ans[i] == '9') {

                } else {
                    A1 = 1;
                    break;
                }
            }
            for (int j = 0; B > j; j++) {
                if (ans[A + 1 + j] == '0' || ans[j + A + 1] == '1' || ans[j + A + 1] == '2' || ans[j + A + 1] == '3' || ans[j + A + 1] == '4' || ans[j + A + 1] == '5' || ans[j + A + 1] == '6' || ans[j + A + 1] == '7' || ans[j + A + 1] == '8' || ans[j + A + 1] == '9') {

                } else {
                    A2 = 1;
                    break;
                }
            }
        } else {
            A1 = 1;
            A2 = 1;
        }
        if (A1 == 0 && A2 == 0) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
