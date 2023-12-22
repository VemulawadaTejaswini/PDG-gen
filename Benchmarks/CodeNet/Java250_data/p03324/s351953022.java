import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int d = sc.nextInt();
        int n = sc.nextInt();
        if(n == 100) n = 101;
        if(d == 0) {
            System.out.println(n);
        } else if(d == 1) {
            System.out.println(n * 100);
        } else {
            System.out.println(n * 100 * 100);
        }
    }
}