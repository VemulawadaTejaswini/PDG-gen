import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double A = s.nextInt();
        double B = s.nextInt();

        double n = Math.ceil((B - A) / (A - 1.0) + 1.0);
        System.out.println((int)n);
    }

}
