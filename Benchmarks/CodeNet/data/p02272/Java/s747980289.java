
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.StreamTokenizer;
 
public class Main {
    int count = 0;
     
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
     
    private void solv() {
        Scanner input = new Scanner(System.in);
         
        int n = input.nextInt();
        int[] S = new int[n];
        for (int i = 0; i < n; i++) S[i] = input.nextInt();
         
        count = 0;
        mergeSort(S, 0, S.length);
        print(S);
        System.out.println(count);
    }
     
    private void merge(int[] A, int left, int mid, int right) {
        int n1 = mid - left;
        int n2 = right - mid;
        int[] L = new int[n1+1], R = new int[n2+1];
         
        for (int i = 0; i < n1; i++) {
            L[i] = A[left + i];
        }
        for (int i = 0; i < n2; i++) {
            R[i] = A[mid + i];
        }
        L[n1] = Integer.MAX_VALUE;
        R[n2] = Integer.MAX_VALUE;
         
        int i = 0, j = 0;
        for (int k = left; k < right; k++) {
            count++;
            if (L[i] <= R[j]) {
                A[k] = L[i++];
            } else {
                A[k] = R[j++];
            }
        }
    }
    private void mergeSort(int[] A, int left, int right) {
        if (left + 1 < right) {
            int mid = (left + right) / 2;
            mergeSort(A, left, mid);
            mergeSort(A, mid, right);
            merge(A, left, mid, right);
        }
    }
     
    private void print(Object[] xs) {
        StringBuilder sb = new StringBuilder();
        for (Object x : xs) sb.append(x.toString()).append(' ');
        System.out.println(sb.toString().trim());
    }
     
    private void print(int[] xs) {
        StringBuilder sb = new StringBuilder();
        for (int x : xs) sb.append(x).append(' ');
        System.out.println(sb.toString().trim());
    }
     
    private static class Scanner {
        BufferedReader r;
        StreamTokenizer st;
         
        public Scanner(InputStream in) {
            r = new BufferedReader(new InputStreamReader(in));
            st = new StreamTokenizer(r);
        }
         
        public String next() {
            nextToken();
            return st.sval;
        }
         
        public Integer nextInt() {
            nextToken();
            return (int)st.nval;
        }
         
        private int nextToken() {
            int token = st.TT_EOF;
            try {
                token = st.nextToken();
            } catch (IOException e) {
            }
            return token;
        }
    }
}