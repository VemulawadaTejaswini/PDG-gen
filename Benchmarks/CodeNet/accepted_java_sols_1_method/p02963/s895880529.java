import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long s = sc.nextLong();
        StringBuilder sb = new StringBuilder();
        sb.append("0 0 1000000000 1 ");
        int v = 1_000_000_000;
        long x = (v - s % v) % v;
        long y = (s + x) / v;
        sb.append(x);
        sb.append(" ");
        sb.append(y);
        System.out.println(sb);
    }

}
