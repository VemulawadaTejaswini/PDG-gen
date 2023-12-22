import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        @SuppressWarnings("resource")
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int [] d = new int[] {a,b,c};
        Arrays.sort(d);
        if ((d[1] - d[0] )% 2 == 0) {
            System.out.println((d[1] - d[0]) / 2 + d[2] - d[1] );
        } else {
            System.out.println((d[1] - d[0] - 1) / 2 + d[2] + 1 - d[1] + 1 );
        }
    }

}
