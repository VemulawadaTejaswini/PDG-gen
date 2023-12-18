

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int n = sc.nextInt();
        int num = 1;
        while (num * 2 <= n) {
            num = num * 2;
        }
        System.out.println(num);
    }
}
