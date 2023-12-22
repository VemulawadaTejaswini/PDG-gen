import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int s = sc.nextInt();
        int k = s + 1000;
        k = k % 1000;
        System.out.println((1000 - k) % 1000);
    }
}
