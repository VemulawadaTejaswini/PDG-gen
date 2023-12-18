import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = n / 111;
        if (n % 111 != 0) count++;
        System.out.println(count * 111);
    }
}
