

import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println(IntStream.range(0, sc.nextInt()).map(i -> sc.nextInt()).distinct().count());

        sc.close();
    }
}