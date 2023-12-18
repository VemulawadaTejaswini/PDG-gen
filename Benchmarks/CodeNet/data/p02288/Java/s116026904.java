
import javax.xml.crypto.Data;
import java.util.*;
import java.io.*;

public class Main {
    public static int n;
    public static int MAX = 500000;
    public static long a[] = new long[MAX + 1];

    public static void main(String[] args) throws IOException {

        //??\???
        /*
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        */
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextLong();
        }

        //??????
        solve();
    }

    public static void solve() {
        for(int i = n / 2 - 1; i >=0; i--) {
            maxheap(i);
        }
        for(int i = 0; i < n; i++) {
            if(i != 0) System.out.print(" ");
            System.out.print(a[i]);
        }
        System.out.println();
    }

    public static void maxheap(int i) {
        int l = 2 * i + 1, r = l + 1;
        int large = i;
        if(l < n && a[large] < a[l]) large = l;
        if(r < n && a[large] < a[r]) large = r;
        if(large != i) {
            long temp = a[i];
            a[i] = a[large];
            a[large] = temp;
            maxheap(large);
        }
    }


}