import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;

class Main{
    private static int t = 0;
    private static int[] L, R;
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final PrintStream out = new PrintStream(System.out);
        final int n = Integer.parseInt(br.readLine());
        final String[] in = br.readLine().split(" ");
        final int[] s = new int[n];
        for(int i = 0; i<n; i++)
            s[i] = Integer.parseInt(in[i]);
        L = new int[((n+1)>>>1)+1];
        R = new int[((n+1)>>>1)+1];
        mergeSort(s, 0, n);
        for(int i = 0; i<n-1; i++){
            out.print(s[i]);
            out.print(' ');
        }
        out.println(s[n-1]);
        out.println(t);
        out.flush();
    }
    private static void mergeSort(int[] a, int l, int r){
        if(l+1<r){
            final int m = (l+r)>>>1;
            mergeSort(a, l, m);
            mergeSort(a, m, r);
            merge(a, l, m, r);
        }
    }
    private static void merge(int[] a, int l, int m, int r){
        final int n1 = m-l;
        final int n2 = r-m;
        System.arraycopy(a, l, L, 0, n1);
        System.arraycopy(a, m, R, 0, n2);
        L[n1] = R[n2] = Integer.MAX_VALUE;
        int i = 0, j = 0;
        for(int k = l; k<r; k++){
            if(L[i]<=R[j]) a[k] = L[i++];
            else a[k] = R[j++];
            t++;
        }
    }
}