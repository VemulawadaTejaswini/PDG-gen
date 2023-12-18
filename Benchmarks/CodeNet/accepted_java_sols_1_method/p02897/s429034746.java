import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());

        int odd = n- n/2;
        Double ans = (double) odd/n;
        System.out.println(String.format("%.10f", ans));
    }
}