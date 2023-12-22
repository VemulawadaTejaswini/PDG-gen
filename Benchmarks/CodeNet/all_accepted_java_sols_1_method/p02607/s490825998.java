import java.util.*;
//import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int i, count = 0;
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int a[] = new int[N];
        for (i = 0; i < N; i++) {
            if (sc.nextInt() % 2 == 1 && i % 2 == 0)
                count++;
        }

        System.out.println(count);
    }
}