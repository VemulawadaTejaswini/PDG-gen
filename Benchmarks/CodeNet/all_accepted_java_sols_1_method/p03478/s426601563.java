import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        int a = Integer.parseInt(sc.next());
        int b = Integer.parseInt(sc.next());

        int result = 0;
        for (int i = 1; i <= n; i++) {
            String numStr = String.valueOf(i);
            int sum = 0;
            for (int j = 0; j < numStr.length(); j++) {
                sum += Integer.parseInt(String.valueOf(numStr.charAt(j)));
            }

            if (sum >= a && sum <= b) {
                result += i;
            }
        }

        System.out.println(result);
    }
}
