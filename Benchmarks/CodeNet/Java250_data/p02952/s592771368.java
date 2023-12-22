import java.util.Scanner;

public class Main {
    public static int N = 0;
    public static String output = "";

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int length = String.valueOf( N ).length();
        if (length == 6) {
            output = Integer.toString(9 + 900 + 90000);
        }
        else if (length == 5) {
            output = Integer.toString(9 + 900 + (N - 9999));
        }
        else if (length == 4) {
            output = Integer.toString(9 + 900);
        }
        else if (length == 3) {
            output = Integer.toString(9 + (N - 99));
        }
        else if (length == 2) {
            output = Integer.toString(9);
        }
        else if (length == 1) {
            output = Integer.toString(N);
        }

        System.out.println(output);
    }
}