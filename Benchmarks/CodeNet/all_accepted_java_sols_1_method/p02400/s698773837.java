import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num = Double.parseDouble(sc.nextLine());

        double ans1 = num * num * Math.PI;
        double ans2 = (num * 2) * Math.PI;

        System.out.println(String.format("%.5f", ans1) + " " + String.format("%.5f", ans2));


    }
}