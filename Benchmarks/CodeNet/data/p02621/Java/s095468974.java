
import java.util.Scanner;

public class Main {

    static Scanner sc = new Scanner(System.in);


    public static void main(String[] args) {
        int a = sc.nextInt();
        long sum = a + (a * a) + (a * a * a);
        System.out.println(sum);
    }
}