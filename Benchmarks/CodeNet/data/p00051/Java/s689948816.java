import java.util.Arrays;
import java.util.Scanner;

class Main {

    public static void main(String[] args) {
        Scanner sc = null;
        try {
            sc = new Scanner(System.in);
            while (sc.hasNextInt()) {
                int dataSet = sc.nextInt();
                for (int i = 0; i < dataSet; i++) {
                    String originalNum = sc.next();
                    char[] charNum = originalNum.toCharArray();

                    // asc
                    Arrays.sort(charNum);
                    int maxNum = Integer.parseInt(String.valueOf(charNum));

                    // desc
                    int minNam = Integer
                            .parseInt(String.valueOf(desc(charNum)));

                    // max-min
                    int result = minNam - maxNum;
                    System.out.println(result);
                }
            }
        } finally {
            sc.close();
        }
    }

    private static char[] desc(char[] c) {
        char[] after = new char[c.length];

        for (int i = 0; i < c.length; i++) {
            after[i] = c[c.length - (1 + i)];
        }
        return after;
    }
}