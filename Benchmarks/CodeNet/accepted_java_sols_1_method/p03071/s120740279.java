import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int a = s.nextInt(), b = s.nextInt();
        int[] x = {a, a - 1, b, b - 1};
        Arrays.sort(x);
        System.out.println(x[2] +  x[3]);
    }
}
