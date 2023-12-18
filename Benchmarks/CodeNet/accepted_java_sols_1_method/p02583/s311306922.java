import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++) {
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int res = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i+1; j < n; j++) {
                if(a[i] == a[j]) continue;
                for (int k = j+1; k < n; k++) {
                    if(a[i] == a[k] || a[j] == a[k]) continue;
                    if(a[i] + a[j] > a[k]) res++;
                }
            }
        }
        System.out.println(res);
    }



}