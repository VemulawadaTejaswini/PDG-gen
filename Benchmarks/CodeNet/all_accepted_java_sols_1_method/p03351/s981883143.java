import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();
        if ((Math.abs(b - a) <=d && Math.abs(c - b) <= d) || Math.abs(c - a) <= d) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}