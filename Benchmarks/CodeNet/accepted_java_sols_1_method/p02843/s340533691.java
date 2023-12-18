import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        if (X < 100) {
            System.out.println(0);
            return;
        }

        int sumOfProduct = X / 100;
        int mod = X % 100;

        for (int i5 = 0; i5 <= sumOfProduct; i5++) {
            for (int i4 = 0; i4 <= sumOfProduct - i5; i4++) {
                for (int i3 = 0; i3 <= sumOfProduct - i5 - i4; i3++) {
                    for (int i2 = 0; i2 <= sumOfProduct - i5 - i4 - i3; i2++) {
                        for (int i1 = 0; i1 <= sumOfProduct - i5 - i4 - i3 - i2; i1++) {
                            if (i5 * 5 + i4 * 4 + i3 * 3 + i2 * 2 + i1 == mod) {
                                System.out.println(1);
                                return;
                            }
                        }
                    }
                }
            }
        }
        System.out.println(0);

    }
}