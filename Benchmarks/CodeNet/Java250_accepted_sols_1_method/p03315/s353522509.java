import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        int cnt = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == '+')
                cnt += 1;
            else
                cnt -= 1;
        }
        System.out.println(cnt);
    }
}
