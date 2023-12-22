import java.util.*;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int smaller = Math.min(a, b);
        int bigger = Math.max(a, b);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < bigger; i++) {
            result.append(smaller);
        }

        System.out.println(result);
    }
}