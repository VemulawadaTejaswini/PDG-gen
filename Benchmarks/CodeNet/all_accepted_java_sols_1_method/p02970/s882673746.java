import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextInt();
        double d = sc.nextInt();
        System.out.println((int)Math.ceil(n/(2*d+1)));
    }
}