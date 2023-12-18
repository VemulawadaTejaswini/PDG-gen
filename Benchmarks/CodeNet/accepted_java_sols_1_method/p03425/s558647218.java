import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int name[] = new int [5];
        Arrays.fill(name, 0);
        for (int i = 0; i < n; i++) {
            String s = in.next();
            if (s.charAt(0) == 'M') name[0]++;
            if (s.charAt(0) == 'A') name[1]++;
            if (s.charAt(0) == 'R') name[2]++;
            if (s.charAt(0) == 'C') name[3]++;
            if (s.charAt(0) == 'H') name[4]++;
        }

        long total = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = i + 1; j < 4; j++) {
                for (int k = j + 1; k < 5; k++) {
                    total += (long)name[i] * name[j] * name[k];
                }
            }
        }

        System.out.println(total);
    }
}