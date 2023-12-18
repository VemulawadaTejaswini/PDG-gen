import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] a_b_c = sc.nextLine().split(" ");
        int a = Integer.parseInt(a_b_c[0]);
        int b = Integer.parseInt(a_b_c[1]);
        int c = Integer.parseInt(a_b_c[2]);
        int i = (int)IntStream.rangeClosed(a, b)
                .filter(x -> {
                    return c % x == 0;
                })
                .count();
        System.out.println(i);
    }
}


