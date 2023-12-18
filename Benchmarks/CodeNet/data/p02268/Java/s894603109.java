import java.util.Scanner;
import java.util.Arrays;

class Main { 
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int n = in.nextInt();
        int[] S = new int[n];
        for (int i = 0; n != 0; i++) {
            S[i] = in.nextInt();
            n--;
        }
        
        int q = in.nextInt();
        int[] T = new int[q];
        for (int i = 0; q != 0; i++) {
            T[i] = in.nextInt();
            q--;
        }
        
        System.out.println(include(S, T));
    }
    
    static int include(int[] S, int[] T) {
        int count = 0;
        for (int i = 0; i < T.length; i++) {
            if (binarySearch(S, T[i]) >= 0) count++;
        }
        return count;
    }
    static int binarySearch(int[] a, int key) {
        int lo = 0;
        int hi = a.length - 1;
        while (lo <= hi) {
            // Key is in a[lo..hi] or not present.
            int mid = lo + (hi - lo) / 2;
            if      (key < a[mid]) hi = mid - 1;
            else if (key > a[mid]) lo = mid + 1;
            else return mid;
        }
        return -1;
    }
}