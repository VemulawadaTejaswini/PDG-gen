import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.next());
        Integer[] a = new Integer[n];
        for(int i=0; i<n; i++) {
            a[i] = Integer.parseInt(sc.next());
        }
        
        int count = 0;
        Arrays.sort(a, Collections.reverseOrder());
        for(int i=0; i<n; i++) {
            if(i>0) {
                if(a[i-1] == a[i]) {
                    count++;
                    continue;
                }
            }
            if(i<n-1) {
                if(a[i+1] == a[i]) {
                    count++;
                    continue;
                }
            }
            for(int j=n-1; i<j; j--) {
                if(a[j] > a[i]/2) break;
                if(a[i] % a[j] == 0) {
                    count++;
                    break;
                }
            }
        }
        System.out.println(n-count);
    }
}