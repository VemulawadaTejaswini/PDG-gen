

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sn = new Scanner(System.in);

        int a = sn.nextInt();
        int b = sn.nextInt();

        int sum = a + b;
        int sub = a -b;
        int malti = a * b;

        int max = sum;
        if (max < sub) {
            max = sub;
        }
        if (max < malti) {
            max = malti;
        }

        System.out.println(max);

    }
}