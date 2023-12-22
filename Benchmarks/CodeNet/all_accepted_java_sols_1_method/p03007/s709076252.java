import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        int p = 0;
        int m = 0;
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
            if(a[i] < 0) m++;
            else p++;
        }
        Arrays.sort(a);
        StringBuilder sb = new StringBuilder();
        int t;
        if(p == 0){
            t = a[n-1];
            for (int i = 0; i < n-1; i++) {
                sb.append(t + " " + a[i] + "\n");
                t -= a[i];
            }
        }else if(m == 0){
            if(2 < p){
                t = a[0];
                for (int i = 1; i < n-1; i++) {
                    sb.append(t + " " + a[i] + "\n");
                    t -= a[i];
                }
                sb.append(a[n-1] + " " + t + "\n");
                t = a[n-1] - t;
            }else{
                sb.append(a[n-1] + " " + a[n-2] + "\n");
                t = a[n-1] - a[n-2];
            }
        }else if(p == 1){
            t = a[n-1];
            for (int i = 0; i < n-1; i++) {
                sb.append(t + " " + a[i] + "\n");
                t -= a[i];
            }
        }else{
            t = a[0];
            for (int i = m; i < n-1; i++) {
                sb.append(t + " " + a[i] + "\n");
                t -= a[i];
            }
            sb.append(a[n-1] + " " + t + "\n");
            t = a[n-1] - t;
            for (int i = 1; i < m; i++) {
                sb.append(t + " " + a[i] + "\n");
                t -= a[i];
            }
        }
        System.out.println(t);
        System.out.print(sb.toString());
        sc.close();

    }

}
