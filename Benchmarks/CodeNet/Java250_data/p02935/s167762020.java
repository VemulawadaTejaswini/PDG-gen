import java.util.*;
 
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        double v[] = new double[n];
        for (int i = 0; i < n; i++) {
            v[i] = sc.nextDouble();
        }

        quick_sort(v, 0, n-1);

        double sum = (v[0] + v[1]) / 2;

        for (int i = 2; i < n; i++) {
            sum = (sum + v[i]) / 2;
        }

        System.out.println(sum);
    }
    
    static void quick_sort(double[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = (int)d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = (int)d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
}
