import java.util.Scanner;

/**
 * Created by nakatsukatakahiro on 2017/06/10.
 */
class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        String pares = scanner.next();  // parentheses

        String ans = pares;
        int leftPare = 0;
        for (int i = 0; i < N; i++) {
            String pare = pares.substring(i, i + 1);
            if (pare.equals(")") && leftPare == 0) {
                ans = "(" + ans;
            } else if (pare.equals(")") && leftPare > 0) {
                leftPare--;
            } else {
                leftPare++;
            }
        }

        for (int i = 0; i < leftPare; i++) {
            ans = ans + ")";
        }

        System.out.println(ans);

    }
}
