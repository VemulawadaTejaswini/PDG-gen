import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] s = new char[n];
        long[] count = new long[5];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next().charAt(0);
            if (s[i] == 'M') count[0]++;
            if (s[i] == 'A') count[1]++;
            if (s[i] == 'R') count[2]++;
            if (s[i] == 'C') count[3]++;
            if (s[i] == 'H') count[4]++;
        }
        long ans = 0l;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += count[i] * count[j] * count[k];
                }
            }
        }
        System.out.println(ans);
    }
}