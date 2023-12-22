import java.io.*;
import java.math.*;
import java.util.*;

class Main {
    private static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        int m = sc.nextInt();
        int x = sc.nextInt();
        int y = sc.nextInt();

        sc.nextLine();
        int maxX = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).max().getAsInt();
        int minY = Arrays.stream(sc.nextLine().split(" +")).mapToInt(Integer::parseInt).min().getAsInt();
        maxX = Math.max(maxX, x);
        minY = Math.min(minY, y);

        System.out.println(maxX < minY ? "No War" : "War");

        sc.close();
    }
}