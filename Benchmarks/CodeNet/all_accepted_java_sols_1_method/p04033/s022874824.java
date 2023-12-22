import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        String result = "";
        if (a > 0) {
            result = "Positive";
        } else if (a <= 0 && 0 <= b) {
            result = "Zero";
        } else {
            result = ((b - a + 1) % 2 == 0) ? "Positive" : "Negative";
        }
        System.out.println(result);
    }
}
