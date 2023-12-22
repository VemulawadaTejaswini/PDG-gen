import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        final int MAX_NUM = 100000;
        Scanner sc = new Scanner(System.in);

        long[] backet = new long[MAX_NUM + 1];
        long cnt = 0;

        int numberOfIns = sc.nextInt();
        long numberOfArrLength = sc.nextLong();

        for (int i = 0; i < numberOfIns; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            backet[a] += b;
        }

        for (int i = 0; i <= backet.length; i++) {
            cnt += backet[i];

            if (numberOfArrLength <= cnt) {
                System.out.println(i);
                break;
            }
        }
        sc.close();
    }

}
