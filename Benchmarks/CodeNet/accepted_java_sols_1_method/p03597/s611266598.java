import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = (int) Math.pow(n, 2);
        int a = sc.nextInt();
        System.out.println(m - a);
    }
}