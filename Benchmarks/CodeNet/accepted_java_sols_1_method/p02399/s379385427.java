import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        int d = a / b;
        int s = a % b;
        double f = (double)a / (double)b;

        System.out.print(d + " " + s + " ");
        System.out.println(String.format("%.5f", f));
    }
}

