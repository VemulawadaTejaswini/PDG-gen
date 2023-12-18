import java.util.*;

public class Main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[]$) {
        int[] in = new int[] {scanner.nextInt(), scanner.nextInt(), scanner.nextInt()};
        Arrays.sort(in);
        System.out.println(in[0] + in[1]);
    }
}