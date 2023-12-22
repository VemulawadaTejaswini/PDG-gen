import java.util.Scanner;


public class Main {
    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        long m = sc.nextLong();
        long n = sc.nextLong();
        if (m * n % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }

}
