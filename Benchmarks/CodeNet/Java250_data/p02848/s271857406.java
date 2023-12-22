import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        char[] s = sc.next().toCharArray();
        char[] d = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N','O','P','Q','R','S','T','U','V','W','X','Y','Z'};
        char[] t = new char[s.length];
        for (int i = 0 ; i < s.length ; i++) {
            for (int j = 0 ; j < 26 ; j++) {
                if (s[i] == d[j]) {
                    t[i] = d[(j + n) % 26];
                }
            }
        }

        for (int i = 0 ; i < s.length ; i++) {
            System.out.print(t[i]);
        }
        System.out.print("\n");

    }

}