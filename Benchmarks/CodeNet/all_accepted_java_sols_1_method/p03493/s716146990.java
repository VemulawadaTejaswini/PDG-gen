import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int S = sc.nextInt();
        sc.close();

        List<Integer> digits = new ArrayList<>();
        while (S > 0) {
            digits.add(S%10);
            S /= 10;
        }

        int answer = (int) digits.stream()
                .filter(digit -> digit == 1)
                .count();

        System.out.println(answer);
    }
}