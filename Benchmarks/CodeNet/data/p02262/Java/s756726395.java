import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        try {
            int[] A;
            Sort sort = new Sort();
            int n = Integer.parseInt(br.readLine());
            A = new int[n];
            for(int i = 0; i < n; i++){
                A[i] = Integer.parseInt(br.readLine());
            }

            A = sort.shellSort(A,n);
            System.out.println(sort.m);

            for(int g : sort.G){
                System.out.println(g);
            }

            System.out.println(sort.cnt);

            for(int g : A){
                System.out.println(g);
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

class Sort{
    int cnt ,m;
    int[] G;
    private void insertionSort(int[] A, int n, int g){
        int j, v;
        for(int i = g; i < n; i++){
            v = A[i];
            j = i - g;
            while(j >= 0 && A[j] > v){
                A[j+g] = A[j];
                j = j - g;
                cnt++;
            }
            A[j+g] = v;
        }
    }
    int[] shellSort(int[] A, int n){
        cnt = 0;
        G = arrayForSort(n);
        m = G.length;
        for(int i = 0; i <= m-1; i++){
            insertionSort(A, n, G[i]);
        }
        return A;
    }
    private int[] arrayForSort(int a){
        long[] B = new long[1000];
        long[] C = new long[1000];
        B[0] = 1;
        B[1] = 1;
        long max = 0;
        int i = 2;
        while(max < a){
            B[i] = B[i-1] + B[i-2];
            C[i-2] = (long)Math.pow(B[i-1], 1 + Math.sqrt(5));
            max = C[i-2];
            i++;
        }
        int[] D = new int[i-3];
        for(int j = 0; j < i-3; j++){
            D[j] = (int)C[i-4-j];
        }
        return D;
    }
}