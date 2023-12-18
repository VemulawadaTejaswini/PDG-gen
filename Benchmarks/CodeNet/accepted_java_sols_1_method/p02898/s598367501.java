

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        System.out.println(IntStream.range(0, n).map(e -> sc.nextInt()).filter(h -> h >= k).count());

        sc.close();
    }
}