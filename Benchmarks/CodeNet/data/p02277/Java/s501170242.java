import java.util.*;
import java.io.*;

public class Main {
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solv();
    }
    
    private void solv() {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        Card[]A = new Card[n];
        for(int i = 0; i < n; i++) {
            String mark = input.next();
            int no = input.nextInt();
            A[i] = new Card(mark, no);
        }
        Card[] B = Arrays.copyOf(A, A.length);
        ms(B);
        
        qs(A, 0, A.length - 1);
        
        boolean stable = true;
        for (int i = 0; i < A.length; i++) {
            if (A[i].mark.equals(B[i].mark) && A[i].no == B[i].no) {
            } else {
                stable = false;
                break;
            }
        }
        
        System.out.println(stable ? "Stable" : "Not stable");
        for (Card c : A) System.out.println(c);
    }
    
    private int partition(Card[] A, int p, int r) {
        Card x = A[r];
        int i = p - 1;
        for (int j = p; j < r; j++) {
            if (A[j].no <= x.no) {
                i = i + 1;
                swap(A, i, j);
            }
        }
        swap(A, i+1, r);
        return i+1;
    }
    
    private void qs(Card[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            qs(A, p, q-1);
            qs(A, q+1, r);
        }
    }
    
    private Card[] ms(Card[] A) {
        if (A.length <= 1) return A;
        int q = A.length / 2;
        Card[] l = ms(Arrays.copyOfRange(A, 0, q));
        Card[] r = ms(Arrays.copyOfRange(A, q, A.length));
        int il = 0, ir = 0;
        for (int i = 0; i < A.length; i++) {
            if (l.length <= il) A[i] = r[ir++];
            else if (r.length <= ir) A[i] = l[il++];
            else if (l[il].no > r[ir].no) A[i] = r[ir++];
            else A[i] = l[il++];
        }
        return A;
    }
    
    private void swap(Card[] A, int i, int j) {
        Card temp = A[i];
        A[i] = A[j];
        A[j] = temp;
    }
    
    private static class Card {
        String mark;
        int no;
        Card(String mark, int no) {
            this.mark = mark;
            this.no = no;
        }
        @Override public String toString() {
            return new StringBuilder().append(mark).append(' ').append(no).toString();
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