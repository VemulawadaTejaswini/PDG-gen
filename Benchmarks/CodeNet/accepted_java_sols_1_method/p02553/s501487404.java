import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long a = sc.nextInt();
        long b = sc.nextInt();
        long c = sc.nextInt();
        long d = sc.nextInt();
        long[] type = new long[4];
        type[0] = a * c;
        type[1] = a * d;
        type[2] = b * c;
        type[3] = b * d;
        Arrays.sort(type);
        System.out.println(type[3]);
    }
}