import java.util.*;

public class Main{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        double[] v = new double[n];

        for(int i = 0;i<n;i++){
            v[i] = Double.parseDouble(sc.next());
        }
        Arrays.sort(v);
        double ans = 0;
        ans = (v[0] + v[1]) / 2.0;
        for(int i = 1;i <n - 1;i++){
            ans = (ans + v[i + 1]) / 2.0;
        }
        System.out.println(ans);
    }
}