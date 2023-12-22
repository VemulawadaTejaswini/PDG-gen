import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int _500 = sc.nextInt();
        int _100 = sc.nextInt();
        int _50 = sc.nextInt();
        int X = sc.nextInt();

        int way=0;
        for (int i = _500; i >= 0; i--) {
            int sub_500 = X - 500 * i;
            if (sub_500 == 0) {
                way++;
                continue;
            } else if (sub_500 < 0) {
                continue;
            }
            for (int j = _100; j >= 0; j--) {
                int sub_100 = sub_500 - 100 * j;
                if (sub_100 == 0) {
                    way++;
                    continue;
                } else if (sub_100<0) {
                    continue;
                }
                for (int k = _50; k >= 0; k--) {
                    int sub_50 = sub_100 - 50 * k;
                    if (sub_50 == 0) {
                        way++;
                        continue;
                    } else if (sub_50<0) {
                        continue;
                    }
                }
            }
        }

        System.out.printf("%d\n", way);
    }
}