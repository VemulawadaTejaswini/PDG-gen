import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt(), f = sc.nextInt(), b = sc.nextInt();

        if(m >= b) {
            System.out.println(0);
        } else if(m + f >= b) {
            System.out.println(b - m);
        } else {
            System.out.println("NA");
        }
    }
}