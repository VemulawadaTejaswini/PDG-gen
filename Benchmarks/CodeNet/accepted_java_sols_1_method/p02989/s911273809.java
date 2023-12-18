import java.util.Scanner;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for (int i = 0; i < d.length; i++)
            d[i] = sc.nextInt();
        Arrays.sort(d);
        int count = d[n / 2] - d[n / 2 - 1];
        System.out.println(count);
    }
}
