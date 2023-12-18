import java.util.*;

public class Main {
    public static String mainString;
    public static String subString;
    public static int maxLength = 0;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();
        String[] lines = line.split(" ", 0);
        int n = Integer.parseInt(lines[0]);
        int k = Integer.parseInt(lines[1]);
        int[] countList = new int[n];
        int[] moveList = new int[n];

        int t = 0;
        for (int i = 0; i < k; i++) {
            line = sc.nextLine();
            lines = line.split(" ", 0);
            int start = Integer.parseInt(lines[0]);
            int end = Integer.parseInt(lines[1]);

            for (int j = start; j <= end; j++) {
                moveList[t++] = j;
            }
        }

        countList[0] = 1;
        for (int i = 0; i < n; i++) {
            if (countList[i] == 0) {
                continue;
            }

            for (int j = 0; j < t; j++) {
                if (i + moveList[j] < n) {
                    long temp = (long)countList[i + moveList[j]] + (long)countList[i];
                    temp %= 998244353;
                    countList[i + moveList[j]] = (int)temp;
                }
            }
            /*
            System.out.println(i);
            for (int i2 = 0; i2 < n; i2++) {
                System.out.printf("%d:", countList[i2]);
            }
            System.out.printf("\n");*/
        }

        System.out.println(countList[n - 1]);
    }

}