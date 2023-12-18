import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Main {
	public static void main (String[] args) throws IOException{
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(in.readLine());
        String[] strNum = in.readLine().split(" ");
        int[] numArray = new int[n];
        
        for (int i=0; i<n; i++) {
            numArray[i] = Integer.parseInt(strNum[i]);
        }
        
        quickSort(numArray, 0, n-1);
        
        
        for (int i=0; i<n; i++) {
            if (i==n-1) {
                System.out.println(numArray[i]);
            } else {
                System.out.printf("%d ", numArray[i]);
            }
        }
        
    }
    
    public static int med3(int x, int y, int z) {
        if (x < y) {
            if (y < z) {
                return y;
            } else if (z < x) {
                return x;
            } else {
                return z;
            }
        } else {
            if (z < y) {
                return y;
            } else if (x < z) {
                return x;
            } else {
                return z;
            }
        }
    }
    
    public static void quickSort(int[] a, int l, int r) {
        int pivot, i, j, t;
        if (r > l) {
            i = l; j = r;
            pivot = med3(a[i], a[i+(j-i)/2], a[j]);
            for (;;) {
                while (a[i] < pivot) i++;
                while (a[j] > pivot) j--;
                if (i>=j) break;
                t = a[i]; a[i] = a[j]; a[j] = t;
                i++;
                j--;
            }
            quickSort(a, l, i-1);
            quickSort(a, j+1, r);
        }
    }
}