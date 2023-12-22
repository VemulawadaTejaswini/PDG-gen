import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double n =  scanner.nextDouble();
        System.out.println(String.format("%.6f", Math.pow(n/3, 3)));
    }

}
