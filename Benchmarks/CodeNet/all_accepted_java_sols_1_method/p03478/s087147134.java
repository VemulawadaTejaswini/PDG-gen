import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = 0;
        for (int i = 0; i < n; i++) {
            String[] digit = String.valueOf(i + 1).split("");
            int digitSum = 0;
            for (int j = 0; j < digit.length; j++) {
                digitSum += Integer.parseInt(digit[j]);
            }
            if (digitSum >= a && digitSum <= b) {
                sum += i + 1;
            }
        }
        System.out.println(sum);
    }

}
