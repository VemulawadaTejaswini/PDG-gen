import java.util.Scanner;

public class Main {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = sc.nextInt();

        int range = d * 2 + 1;
        int result = n % range == 0 ? n / range : n / range + 1;

        System.out.println(result);
    }
}
