import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int h = sc.nextInt();
        int w = sc.nextInt();
        int hh = sc.nextInt();
        int www = sc.nextInt();
        int a = h - hh;
        int b = w - www;
        System.out.println(a * b);
        sc.close();
    }
}