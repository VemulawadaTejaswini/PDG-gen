import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int[] x = new int[m];
        for(int i = 0; i < m; i++){
            x[i] = sc.nextInt();
        }
        Arrays.sort(x);
        int l = x[m - 1] - x[0];

        Integer[] y = new Integer[m - 1];
        for(int i = 0; i < m - 1; i++){
            y[i] = x[i + 1] - x[i];
        }
        Arrays.sort(y, Comparator.reverseOrder());

        for(int i = 0; i < Math.min(n - 1, m - 1); i++){
            l -= y[i];
        }

        System.out.println(l);

    }
}
