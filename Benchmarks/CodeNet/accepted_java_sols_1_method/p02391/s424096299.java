

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();

    public static void main(String[] args) {
        if (a > b)
            System.out.println("a" + " > " + "b");
        else if (a < b)
            System.out.println("a" + " < " + "b");
        else
            System.out.println("a" + " == " + "b");
    }
}

