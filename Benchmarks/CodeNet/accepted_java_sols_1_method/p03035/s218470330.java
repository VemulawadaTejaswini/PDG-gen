import java.util.Scanner;

public class Main {

    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.println(a >= 13 ? b : a >=6 ? b/2 : 0);

    }
}
