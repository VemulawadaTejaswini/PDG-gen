

import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    static int a = sc.nextInt();
    static int b = sc.nextInt();
    static int c = sc.nextInt();

    public static void main(String[] args) {
        if (a < b && b < c && a < c)
            System.out.println("Yes");
        else 
            System.out.println("No");
    }
}

