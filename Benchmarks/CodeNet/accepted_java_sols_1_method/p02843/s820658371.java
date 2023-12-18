import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int a = x/100;
        int b = x%100;
        System.out.println(5*a >= b ? 1:0);
    }
}