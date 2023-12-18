import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int answer = 0;
        for (int i = 1; i <= n; i++) {
            int temp = input.nextInt();
            if (i % 2 != 0 && temp % 2 != 0)
                answer++;
        }
        System.out.println(answer);
    }
}