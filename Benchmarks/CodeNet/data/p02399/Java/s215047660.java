import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        long num1 = Integer.parseInt(lines[0]);
        long num2 = Integer.parseInt(lines[1]);

        long ans1 = num1 / num2;
        long ans2 = num1 % num2;
        float ans = (float)num1 / (float)num2;
        String ans3 = String.format("%.9f", ans);

        System.out.println(ans1 + " " + ans2 + " " + ans3);

    }
}