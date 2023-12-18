import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = Long.parseLong(sc.next());
        long b = Long.parseLong(sc.next());
        long n = Long.parseLong(sc.next());
        long num = n < b ? n : b - 1;
        System.out.println((long)(Math.floor(a * num * 1.0 / b) - (a * Math.floor(num * 1.0 / b))));
    }
}