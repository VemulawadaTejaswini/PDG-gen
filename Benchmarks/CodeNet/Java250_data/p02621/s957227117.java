import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = n + (int) Math.pow(n, 2) + (int) Math.pow(n, 3);
        System.out.println(sum);

    }
}