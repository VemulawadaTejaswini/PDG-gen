import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int K = sc.nextInt();

        int g = K / 2;
        int k = (int) Math.ceil(K / 2.0);

        System.out.println(g * k);

    }
}