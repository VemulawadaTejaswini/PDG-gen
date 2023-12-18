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
        final int[] A = new int[n];
        for(int i = 0; i<n; i++)
            A[i] = Integer.parseInt(in.nextToken());
        final int x = partition(A, 0, n-1);
        for(int i = 0; i<x; i++)
            sb.append(A[i]).append(' ');
        sb.append('[').append(A[x]).append(']');
        for(int i = x+1; i<n; i++)
            sb.append(' ').append(A[i]);
        System.out.println(sb);
    }
    private static int partition(int[] A, int p, int r){
        final int x = A[r];
        int i = p;
        int t;
        for(int j = p; j<r; j++){
            if(A[j]<=x){
                t = A[i];
                A[i] = A[j];
                A[j] = t;
                i++;
            }
        }
        A[r] = A[i];
        A[i] = x;
        return i;
    }
}