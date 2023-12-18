import java.lang.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double n = Double.parseDouble(sc.next());
        sc.close();
        System.out.printf("%f %f", n * n * Math.PI, 2 * n * Math.PI);
    }
}
