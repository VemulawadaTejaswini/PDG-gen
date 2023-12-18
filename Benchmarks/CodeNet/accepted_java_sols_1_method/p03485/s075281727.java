import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double average = (sc.nextDouble() + sc.nextDouble()) / 2;
        Double ceil = Math.ceil(average);

        System.out.println(ceil.intValue());
    }
}