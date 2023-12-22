import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt(), b= in.nextInt();
        int c = b - a;
        int sum = (c * (c - 1)) / 2;
        System.out.println(sum - a);
    }
}
