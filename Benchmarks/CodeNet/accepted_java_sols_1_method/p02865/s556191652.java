import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        System.out.println((int)Math.ceil(n / 2.0) - 1);
    }
}