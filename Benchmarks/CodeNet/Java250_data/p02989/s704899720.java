import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [] d = new int [N];
        for(int i=0;i<N;i++){
            d[i] = scan.nextInt();
        }
        quick_sort(d,0,N-1);
        if(d[(N/2)-1]==d[N/2]){
            System.out.println("0");
        }else{
            System.out.println(d[N/2]-d[(N/2)-1]);
        }
    }
    static void quick_sort(int[] d, int left, int right) {
        if (left >= right) {
            return;
        }
        int p = d[(left + right) / 2];
        int l = left, r = right, tmp;
        while (l <= r) {
            while (d[l] < p) {
                l++;
            }
            while (d[r] > p) {
                r--;
            }
            if (l <= r) {
                tmp = d[l];
                d[l] = d[r];
                d[r] = tmp;
                l++;
                r--;
            }
        }
        quick_sort(d, left, r);
        quick_sort(d, l, right);
    }
}