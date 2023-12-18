import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int max = x / 100;
        int diff = x % 100;

        if (diff <= max * 5) {
            System.out.println(1);
        } else {
            System.out.println(0);
        }
    }
}
