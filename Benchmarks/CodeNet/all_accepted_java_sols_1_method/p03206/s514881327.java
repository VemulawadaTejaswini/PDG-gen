

import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        String str = "Christmas";
        if (a < 25) {
            for (int i = 0; i < 25 - a; i++) {
                str += " Eve";
            }
        }
        System.out.println(str);
    }
}
