import java.io.*;
import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int [] p = new int [n];
        for(int i=0;i<n;i++){
            p[i] = scan.nextInt();
        }
        int count = 0;
        int [] copyP = new int [3];
        for(int i=1;i<n-1;i++){
            copyP[0]= p[i-1];
            copyP[1]= p[i];
            copyP[2]= p[i+1];
            quick_sort(copyP,0,2);
            if(copyP[1]==p[i]){
                count++;
            }
        }
        System.out.println(count);
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