import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        sc.close();

        long abMin = Math.min(a,b);
        long abMax = Math.max(a,b);
        long cdMin = Math.min(c,d);
        long cdMax = Math.max(c,d);

        long[] tmpAns = new long[4];
        tmpAns[0] = abMin * cdMin;
        tmpAns[1] = abMin * cdMax;
        tmpAns[2] = abMax * cdMin;
        tmpAns[3] = abMax * cdMax;

        Arrays.sort(tmpAns);

        System.out.println(tmpAns[3]);
    }
}
