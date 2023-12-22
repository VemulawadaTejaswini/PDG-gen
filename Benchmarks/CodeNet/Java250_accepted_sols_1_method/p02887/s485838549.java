import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = Integer.parseInt(scanner.next());
        String S = scanner.next();
        int count = 1;
        char now_char = S.charAt(0);

        for(int i = 0; i < N; i++) {
            if(now_char != S.charAt(i)) {
                count++;
                now_char = S.charAt(i);
            }
        }

        System.out.println(count);

        scanner.close();
    }
}