import java.util.Scanner;

public class Main {
    static final double TSUBO = 3.305785;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");
        double res = (double) Integer.parseInt(input[0]) * (double) Integer.parseInt(input[1]) / TSUBO;
        System.out.println(Math.ceil(res * 1000000) / 1000000);
    }
}