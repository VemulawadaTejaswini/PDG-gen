import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String args[]) {
        int a, b, c, k;
        int max = 0;
        int sum = 0;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        k = sc.nextInt();

        int[] array = {a,b,c};
        for (int i = 1; i <= k; i++) {
            for (int j = 0; j < array.length; j++) {
                max = Math.max(max,array[j]);
            }
            for (int j = 0; j < array.length; j++) {
                if (max == array[j]) {
                    array[j] *= 2;
                    break;
                }
            }
        }
        for (int i = 0; i < array.length; i++) {
            sum += array[i];
        }
        System.out.println(sum);
    }
}
