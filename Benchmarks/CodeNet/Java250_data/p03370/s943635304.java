import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = sc.nextInt();

        int[] m = new int[n];
        for(int i=0; i<n; i++) {
            m[i] = sc.nextInt();
        }

        int sum = 0;
        for(int i: m) {
            sum += i;
        }

        Arrays.sort(m);

        int rest = 0;
        if(x - sum > 0) {
            rest = (x-sum) / m[0];
            System.out.println(rest+n);
        } else {
            System.out.println(n);
        }
        sc.close();
    }
}
