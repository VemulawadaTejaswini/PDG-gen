import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        String[] s = new String[n];
        long count = 0;
        int tmpCount = 1;

        for (int i = 0; i < n; i++) {
            char[] tmp = scanner.next().toCharArray();
            Arrays.sort(tmp);
            s[i] = String.valueOf(tmp);
        }

        Arrays.sort(s);

        for (int i = 1; i < n; i++) {
            if(s[i-1].equals(s[i])) {
                count += tmpCount;
                tmpCount++;
            } else {
                tmpCount = 1;
            }
        }
        System.out.println(count);

    }

}

