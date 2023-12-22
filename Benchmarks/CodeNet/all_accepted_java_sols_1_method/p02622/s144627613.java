

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        String a = sc.next();
        String b = sc.next();
        int sum = 0;
        for (int i = 0; i < a.length(); i++) {
            if (a.charAt(i) != b.charAt(i)) {
                sum++;
            }
        }
        System.out.println(sum);
    }
}