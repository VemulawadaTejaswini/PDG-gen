import java.util.*;
import java.io.*;

public class Main {
    int count = 0;
    
    public static void main(String[] args) {
        Main main = new Main();
        main.solve();
    }
    
    private void solve() {
        Scanner scanner = new Scanner(System.in);
        
        int factors = scanner.nextInt();
        int[] S = new int[factors];
        
        for(int i = 0; i < factors; i++) S[i] = scanner.nextInt();
        
        count = 0;
        mergeSort(S, 0, S.length);
        print(S);
        System.out.println(count);
    }
    
    private void merge(int[] X, int Xleft, int Xmid, int Xright) {
        int index_1      = Xmid - Xleft;
        int index_2      = Xright - Xmid;
        int[] leftArray  = new int[index_1 + 1];
        int[] rightArray = new int[index_2 + 1];
        
        for(int k = 0; k < index_1; k++) {
            leftArray[k] = X[Xleft + k];
        }
        
        for(int k = 0; k < index_2; k++) {
            rightArray[k] = X[Xmid + k];
        }
        
        leftArray[index_1]  = Integer.MAX_VALUE;
        rightArray[index_2] = Integer.MAX_VALUE;
        
        int i =0, j = 0;
        for(int k = Xleft; k < Xright; k++) {
            count++;
            if(leftArray[i] <= rightArray[j]) {
                X[k] = leftArray[i++];
            } else {
                X[k] = rightArray[j++];
            }
        }
    }
    
    private void mergeSort(int[] X, int Xleft, int Xright) {
        if(Xleft + 1 < Xright) {
            int Xmid = (Xleft + Xright) / 2;
            mergeSort(X, Xleft, Xmid);
            mergeSort(X, Xmid , Xright);
            
            merge(X, Xleft, Xmid, Xright);
        } 
    }
    
    private void print(Object[] xArray) {
        StringBuilder answer = new StringBuilder();
        for(Object x : xArray) answer.append(x.toString()).append(' ');
        System.out.println(answer.toString().trim());
    }
    
    private void print(int[] xArray) {
        StringBuilder answer = new StringBuilder();
        for(int x : xArray) answer.append(x).append(' ');
        System.out.println(answer.toString().trim());
    }
    
    private static class Scanner {
        BufferedReader br;
        StreamTokenizer tokenizer;
        
        public Scanner(InputStream ins) {
            br = new BufferedReader(new InputStreamReader(ins));
            tokenizer = new StreamTokenizer(br);
        }
        
        public String next() {
            nextToken();
            return tokenizer.sval;
        }
        
        public Integer nextInt() {
            nextToken();
            return (int) tokenizer.nval;
        }
        
        private int nextToken() {
            int token = tokenizer.TT_EOF;
            
            try {
                token = tokenizer.nextToken();
            } catch(IOException e) {
                ;
            }
            return token;
        }
    }
}
