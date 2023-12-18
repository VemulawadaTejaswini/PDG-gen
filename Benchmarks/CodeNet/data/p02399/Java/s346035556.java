import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] lines = sc.nextLine().split(" ");
        int num1 = Integer.parseInt(lines[0]);
        int num2 = Integer.parseInt(lines[1]);

        int ans1 = num1 / num2;
        int ans2 = num2 % num2;
        float ans3 = (float)num1 / (float)num2;

        System.out.println(ans1 + " " + ans2 + " " + ans3);

    }
}