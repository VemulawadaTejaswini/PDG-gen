import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] d = new int[n];
        for(int i = 0;i < n;i++) d[i] = sc.nextInt();
        System.out.println(Arrays.stream(d).distinct().count());
    }
}