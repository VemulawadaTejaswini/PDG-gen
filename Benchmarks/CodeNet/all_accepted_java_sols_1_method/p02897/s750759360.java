import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int max = sc.nextInt();
        sc.close();

        double odd = Math.ceil((double) max / 2);

        System.out.println((double) odd / max);
    }
}