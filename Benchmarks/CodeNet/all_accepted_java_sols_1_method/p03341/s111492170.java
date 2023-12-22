import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    private static final PrintStream ps = System.out;
    private static final Scanner     sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        char[] a = sc.next().toCharArray();
        
        int w = 0;
        int e = 0;
        for (int i = n-1; i >= 0; i--) {
            if (a[i] == 'W')
                w++;
            else
                e++;
        }
        int sum = e - (a[0] == 'E' ? 1 : 0);
        int min = sum;
        
        for (int i = 1; i < n; i++) {
            if (a[i-1] == 'W')
                sum ++;
            if (a[i] == 'E')
                sum--;
            min = Math.min(sum, min);
        }
        ps.println(min);
    }
}
