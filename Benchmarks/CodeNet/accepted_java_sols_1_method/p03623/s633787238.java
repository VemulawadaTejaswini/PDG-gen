import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int ax = Math.abs(x - a);
        int bx = Math.abs(x - b);
        System.out.println(ax < bx ? "A" : "B");
    }
}