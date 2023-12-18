import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        long N = in.nextLong();
        long three = N / 3 * (N / 3 + 1) / 2 * 3;
        long five = N / 5 * (N / 5 + 1) / 2 * 5;
        long fifteen = N / 15 * (N / 15 + 1) / 2 * 15;
        long all = N * (N + 1) / 2;
        System.out.println(all - three - five + fifteen);
    }
}