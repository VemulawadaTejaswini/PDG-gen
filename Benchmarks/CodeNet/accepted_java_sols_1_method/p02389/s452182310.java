import java.io.*;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        a = sc.nextInt(); b = sc.nextInt();
        System.out.print(a*b);
        System.out.print(' ');
        System.out.println(2*(a+b));
    }
}