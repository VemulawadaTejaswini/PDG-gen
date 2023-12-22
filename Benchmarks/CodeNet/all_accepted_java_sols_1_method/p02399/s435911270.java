import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        double f = (double)a / b;
        int d = (int)f;
        int r = a % b;
        System.out.println(String.format("%d %d %.5f", d, r, f));
    }
}