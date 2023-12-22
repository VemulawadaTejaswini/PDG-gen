import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vArr = new double[n];

        for (int i = 0; i < n; i++) {
            vArr[i] = (double) sc.nextInt();
        }

        Arrays.sort(vArr);

        for (int i = 0; i < n; i++) {
            if (i+1 >= n) break;
            double tmpNew = (vArr[i] + vArr[i+1])/2;
            vArr[i+1] = tmpNew;
        }

        System.out.println(vArr[n-1]);
    }
}
