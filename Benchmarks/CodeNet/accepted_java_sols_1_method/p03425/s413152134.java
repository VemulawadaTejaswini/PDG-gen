import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] str = new String[n];
        for (int i = 0; i < n; i++) {
            str[i] = sc.next();
        }
        long[] march = new long[5];
        for (int i = 0; i < n; i++) {
            switch (str[i].charAt(0)) {
            case 'M':
                march[0]++;
                break;
            case 'A':
                march[1]++;
                break;
            case 'R':
                march[2]++;
                break;
            case 'C':
                march[3]++;
                break;
            case 'H':
                march[4]++;
                break;
            }
        }
        long ans = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    ans += march[i] * march[j] * march[k];
                }
            }
        }
        System.out.println(ans);

    }
}