import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        double[] v = new double[N];
        for (int i = 0; i < v.length; i++) {
            v[i] = sc.nextDouble();
        }
        Arrays.sort(v);
        double res = v[0];
        for (int i = 1; i < v.length; i++) {
            res = (res + v[i]) / 2;
        }
        System.out.println(res);
        sc.close();
    }
}