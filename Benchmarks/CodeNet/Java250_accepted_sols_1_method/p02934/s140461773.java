import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] ary = new Integer[n];
        for(int i = 0; i < n; ++i) {
            int tmp = Integer.parseInt(sc.next());
            ary[i] = tmp;
        }

        double ans = 0d;
        double sum = 0d;
        for(int i = 0; i < n; ++i) {
            sum += (double)1 / (double)ary[i];
        }

        ans =  (double)1 / sum;

        System.out.println(ans);
    }
}
