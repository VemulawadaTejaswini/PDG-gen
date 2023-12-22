import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final int N = sc.nextInt();
        final int M = sc.nextInt();

        final int[] cities = new int[N];

        for (int i = 0; i < M; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            cities[a-1]++;
            cities[b-1]++;
        }

        for (int city: cities) {
            System.out.println(city);
        }
    }
}
