import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        String s = scan.next();
        System.out.println(a < 3200 ? "red" : s);
    }
}