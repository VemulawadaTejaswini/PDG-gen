import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println((int) Math.ceil(n + Math.pow(n, 2) + Math.pow(n, 3)));
    }
}