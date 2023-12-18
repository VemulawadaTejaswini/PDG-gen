import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ab = sc.nextInt();
        int bc = sc.nextInt();
        int ac = sc.nextInt();

        int result = 1000;
        result = Math.min(ab + bc, result);
        result = Math.min(ac + bc, result);
        result = Math.min(ab + ac, result);
        System.out.println(result);
    }
}