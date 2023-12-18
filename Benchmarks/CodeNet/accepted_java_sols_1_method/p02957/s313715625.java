import java.util.Scanner;

public class Main {
    public static int A = 0;
    public static int B = 0;

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        A = sc.nextInt();
        B = sc.nextInt();

        String output = "";
        int C = A + Math.abs(B);
        if (C % 2 == 0) {
            output = Integer.toString(C / 2);
        } else {
            output = "IMPOSSIBLE";
        }
        System.out.println(output);
    }
}