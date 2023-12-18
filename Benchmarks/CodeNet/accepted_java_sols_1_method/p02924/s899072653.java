import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {
        // Your code here!
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        long answer = 0;
        for (int i = 1; i <= n; i++) {
            answer += i - 1;
        }
        System.out.println(answer);
    }
}
