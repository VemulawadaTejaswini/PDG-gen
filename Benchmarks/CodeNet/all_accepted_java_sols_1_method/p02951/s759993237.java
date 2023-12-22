import java.util.Scanner;

public class Main {
    public static int A = 0;
    public static int B = 0;
    public static int C = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();
        C = sc.nextInt();

        int output = C - (A - B);
        if (output < 0) output = 0;

        System.out.println(output);
    }
}
