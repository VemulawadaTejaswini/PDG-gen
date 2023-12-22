import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int length = input.length();
        char[] S = new char[length];
        for (int i = 0; i < length; i++) {
            S[i] = input.charAt(i);
        }

        int ans = 0;
        for (int i = 1; i < length; i++) {
            if(S[i-1] == S[i]) {
                ans++;
                if (S[i] == '0') {
                    S[i] = '1';
                }
                else {
                    S[i] = '0';
                }
            }
        }

        System.out.println(ans);
    }
}
