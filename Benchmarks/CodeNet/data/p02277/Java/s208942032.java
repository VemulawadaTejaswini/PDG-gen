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
        Arrays.sort(B, new Comparator<Card>() {
            public int compare(Card c1, Card c2) {
                int c = c1.mark.compareTo(c2.mark);
                if (c == 0) return c1.no - c2.no;
                return c;
            }
        });
        
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
        Card temp;
        for (int j = p; j < r; j++) {
            if (A[j].no <= x.no) {
                i = i + 1;
                temp = A[i];
                A[i] = A[j];
                A[j] = temp;
            }
        }
        temp = A[i+1];
        A[i+1] = A[r];
        A[r] = temp;
        return i+1;
    }
    
    private void qs(Card[] A, int p, int r) {
        if (p < r) {
            int q = partition(A, p, r);
            qs(A, p, q-1);
            qs(A, q+1, r);
        }
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