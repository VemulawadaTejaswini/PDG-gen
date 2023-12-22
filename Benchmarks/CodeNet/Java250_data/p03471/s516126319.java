import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int y = sc.nextInt();
        String ans = "";
        int max = n * 5000;

        if (n * 10000 >= y) {
            calc : for (int i = y / 10000; i >= 0 ; i--) {
                int sum = i * 10000;
                if (y - sum > max) {
                    break;
                }
                for (int j = 0; j <= (n - i) ; j++) {
                    int value = sum;
                    value += j * 5000;
                    int k = n - (i + j);
                    value += k * 1000;
                    if (value == y) {
                        ans = i + " " + j + " " + k;
                        break calc;
                    }
                }
            }
        }

        if (ans.isEmpty()) {
            ans = "-1 -1 -1";
        }

        System.out.println(ans);
    }
}