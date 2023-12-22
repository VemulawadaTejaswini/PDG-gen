import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        char c = '1';

        int ans = 0;
        for (int i = 0; i < n; i++) {
            char currentChar = s.charAt(i);
            if (c != currentChar) {
                ans++;
            }
            c = currentChar;
        }
        System.out.println(ans);

        sc.close();
    }

}
