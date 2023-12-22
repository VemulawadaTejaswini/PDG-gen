import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a1 = sc.nextInt();
        int a2 = sc.nextInt();
        int a3 = sc.nextInt();

        int[] diff = new int[3];
        diff[0] = Math.abs(a1 - a2);
        diff[1] = Math.abs(a2 - a3);
        diff[2] = Math.abs(a3 - a1);

        Arrays.sort(diff);
        System.out.println(diff[0] + diff[1]);
    }
}
