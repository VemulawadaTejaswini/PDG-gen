import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        int h = (int)n / 2;
        System.out.println((n - (double)h) / n);
        sc.close();

    }

}
