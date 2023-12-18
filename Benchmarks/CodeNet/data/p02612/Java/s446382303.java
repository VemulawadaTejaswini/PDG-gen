import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt() % 1000;
        System.out.println(n == 0 ? 1000 : n);
    }
}

