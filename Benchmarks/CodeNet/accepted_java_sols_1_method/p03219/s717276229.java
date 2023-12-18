import java.util.*;
public class Main {
    private static long dp[][];
    private static int N;
    private static int A[];
    private static int B[];

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();
        int Y = sc.nextInt();
        System.out.println(String.format("%d", X + (Y / 2)));
    }
}
