import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= N; i++) {
            String imput = String.valueOf(i);
            String[] strings;
            strings = imput.split("");

            int sum = 0;
            for (int j = 0; j <= imput.length() - 1; j++) {
                sum += Integer.valueOf(strings[j]);
            }

            if(A <= sum && sum <= B) {
                result += i;
            }
        }
        System.out.println(result);
    }
}