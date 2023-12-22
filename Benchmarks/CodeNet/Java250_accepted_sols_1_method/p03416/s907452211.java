import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int count = 0;

        for (int i = a; i < b + 1; i++) {
            int i1 = i / 10000;
            int i2 = (i % 10000) / 1000;
            int i4 = (i % 100) / 10;
            int i5 = i % 10;
            if (i1 == i5 && i2 == i4) {
                count++;
            }
        }

        System.out.println(count);
    }
}
