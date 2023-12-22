import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Main{
    public static void main(String[] args) throws IOException{
        final BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        final StringBuilder sb = new StringBuilder();
        final int n = Integer.parseInt(br.readLine());
        final StringTokenizer in = new StringTokenizer(br.readLine(), " ");
        final int[] a = new int[n];
        final int[] b = new int[n];
        final int[] c = new int[10001];
        for(int i = 0; i<n; i++)
            a[i] = Integer.parseInt(in.nextToken());
        for(int i = 0; i<n; i++)
            c[a[i]]++;
        for(int i = 1; i<=10000; i++)
            c[i] += c[i-1];
        for(int i = n-1; i>=0; i--){
            c[a[i]]--;
            b[c[a[i]]] = a[i];
        }
        for(int i = 0; i<n; i++)
            sb.append(b[i]).append(' ');
        sb.setCharAt(sb.length()-1, '\n');
        System.out.print(sb);
    }
}