import java.util.Arrays;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String str[] = new String[n];

        for (int i = 0; i < n; i++) {
            str[i] = "";
            String s = sc.next();
            String tmp[] = new String[10];
            for (int j = 0; j < 10; j++) {
                tmp[j] = s.substring(j, j + 1);
            }
            Arrays.sort(tmp);
            for (int j = 0; j < 10; j++) {
                str[i] = str[i] + tmp[j];
            }
        }
        Arrays.sort(str);
        long ans = 0;
        long tmp = 1;

        for (int i = 0; i < n - 1; i++) {
            while (str[i].equals(str[i + 1])) {
                tmp++;
                i++;
                if (i == n - 1) {
                    break;
                }
            }
            ans += tmp * (tmp - 1) / 2;
            tmp = 1;

        }
        System.out.println(ans);
        sc.close();
    }
}
