import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        long k = sc.nextLong();
        int ans = 0;
        int n = 0;
        for (int i = 0; i < s.length(); i++) {
            n = s.charAt(i) - '0';
            k--;
            if (k == 0 || n > 1) break;
        }
        System.out.println(n);
        sc.close();
    }
}
