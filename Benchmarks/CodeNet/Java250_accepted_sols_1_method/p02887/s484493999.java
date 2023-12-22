import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long N = scanner.nextLong();
        String S = scanner.next();
        scanner.close();

        long ans = 1;
        for(int i = 0; i < N - 1; i++) {
            if(S.charAt(i) != S.charAt(i + 1)) ans++;
        }
        System.out.println(ans);
    }
}