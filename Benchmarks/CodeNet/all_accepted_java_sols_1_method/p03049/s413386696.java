import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n];
        for (int i = 0 ; i < n ; i++) {
            s[i] = sc.next();
        }
        int count = 0;
        int a = 0;
        int b = 0;
        int ba = 0;
        for (int i = 0 ; i < n ; i++) {
            for (int j = 0 ; j < s[i].length() - 1 ; j++) {
                if (s[i].substring(j, j + 2).equals("AB")) count++;
            }
            char first = s[i].charAt(0);
            char last = s[i].charAt(s[i].length() - 1);
            if (first != 'B' && last == 'A') a++;
            if (first == 'B' && last != 'A') b++;
            if (first == 'B' && last == 'A') ba++;
        }

        if (ba == 0) {
            count += Math.min(a, b);
        } else {
            if (a + b > 0) {
                count += ba + Math.min(a, b);
            } else {
                count += ba - 1;
            }
        }

        System.out.println(count);
    }

}