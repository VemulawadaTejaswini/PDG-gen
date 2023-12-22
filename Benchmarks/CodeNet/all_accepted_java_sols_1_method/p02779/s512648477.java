import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] array = new int[n];
        boolean b = true;
        int i;
        for (i=0; i<n; i++) {
            array[i] = sc.nextInt();
        }
        Arrays.sort(array);
        for (i=0; i<n; i++) {
            if (i != 0) {
                if (array[i-1] == array[i]) {
                    b = false;
                    break;
                }
            }
        }
        System.out.println(b ? "YES" : "NO");
    }
}