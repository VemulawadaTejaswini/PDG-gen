import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        PrintWriter cout = new PrintWriter(System.out);

        int n = cin.nextInt();
        int[] a = new int[n];
        for(int i=0;i<n;i++) a[i] = cin.nextInt();

        Arrays.sort(a);
        int cnt = 0;

        for(int i=0;i<n-2;i++) {
            int k = i + 2;
            for(int j=i+1;j<n;j++) {
                while(k < n && a[k] < a[i] + a[j]) k++;
                if(k > j) cnt += k - j - 1;
            }
        }

        cout.println(cnt);
        cout.close();
    }
}