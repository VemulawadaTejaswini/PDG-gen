import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = sc.nextInt();
        int max = Integer.MIN_VALUE, min = sc.nextInt();
        for (int i = 1; i < count; i++) {
            int v = sc.nextInt();
            max = Math.max(max, v - min);
            min = Math.min(min, v);
        }
        System.out.println(max);
    }
}