import java.util.Scanner;
public class Main{
    static void quick_sort(int[] d, int left, int right) {
        if (left>=right) {
            return;
        }
        int p = d[(left+right)/2];
        int l = left, r = right, tmp;
        while(l<=r) {
            while(d[l] < p) { l++; }
            while(d[r] > p) { r--; }
            if (l<=r) {
                tmp = d[l]; d[l] = d[r]; d[r] = tmp;
                l++; r--;
            }
        }
        quick_sort(d, left, r);  // ピボットより左側をクイックソート
        quick_sort(d, l, right); // ピボットより右側をクイックソート
    }
    // 配列内のデータ列を表示する
    static void print_data(int[] d) {
        for(int i = 0; i < d.length; i++) System.out.print(d[i] + " ");
        System.out.println();
    }
    
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    int n = sc.nextInt();
    int[]a = new int[n];
    for(int i = 0; i < n; i++) {
    	a[i] = sc.nextInt();
    }
    quick_sort(a,0,a.length-1);
    int cnt = 0;
    for(int i = n-1; i >= 0; i--) {
    	for(int j = i-1; j >= 0; j--) {
    		if(a[i] % a[j] == 0) {
    			cnt++;
    			break;
    		}
    	}
    }
    System.out.println(n-cnt);
    sc.close();
  }
}