import java.util.*;
import java.lang.*;


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x[] = new int[3];
        for (int i = 0; i < 3; i++) {
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int count = 0;
        while (x[1] < x[2]) {
            x[0]++;
            x[1]++;
            count++;
        }
        if ((x[1] - x[0]) % 2 == 0) {
            count += (x[1] - x[0]) / 2;
        } else {
            count += (x[1] + 1 - x[0]) / 2 + 1;
        }
        System.out.println(count);
    }
}