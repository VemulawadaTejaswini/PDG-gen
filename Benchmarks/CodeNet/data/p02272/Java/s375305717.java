


import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author baito
 */
public class JavaApplication6 {

    /**
     * @param args the command line arguments
     * @throws java.io.FileNotFoundException
     */
    static int count = 0;
    public static void main(String[] args) throws Exception {
        // TODO code application logic here

        ContestScanner sc = new ContestScanner();
        int n = sc.nextInt();
        int A[] = new int[n];
        for (int i = 0; i < n; i++) {
            A[i] = sc.nextInt();
        }
        mergeSort(A, 0, n);
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append(A[i]).append(' ');
        }
        System.out.println(sb);
        System.out.println(count);
       
    }
    //??????not include
    public static void mergeSort (int[] A , int l , int r ) {
        if(l + 1 < r){
            int mid = (l + r)/2;
            mergeSort(A, l, mid);
            mergeSort(A, mid,r);
            merge(A,l,mid,r);
            
        }
        
    }
    public static void merge (int[] A , int l , int m , int r) {
        int n1  = m - l + 1;
        int n2 =  r - m + 1;
        int L[] = new int[n1];
        int R[] = new int[n2];
        System.arraycopy(A, l, L, 0, n1-1);
        L[n1-1] = Integer.MAX_VALUE;
        System.arraycopy(A, m, R, 0, n2-1);
        R[n2-1] = Integer.MAX_VALUE;
        for (int i = l, j= 0 , k= 0; i < r; i++) {
            count++;
            if(L[j] >= R[k]){
                A[i] = R[k++];
            } else {
                A[i] = L[j++];
            }
            
            
        }
        
        
    }
    
    
    
}

//????????????????????????
class ContestScanner {
    
    private final BufferedReader reader;
    private String[] line;
    private int idx;
    
    public ContestScanner() throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(System.in));
    }
    
    public ContestScanner(String filename) throws FileNotFoundException {
        reader = new BufferedReader(new InputStreamReader(new FileInputStream(filename)));
    }
    //???????????? 

    public String readLine() throws Exception {
        return reader.readLine();
    }
    
    public String nextToken() throws IOException {
        if (line == null || line.length <= idx) {
            line = reader.readLine().trim().split(" ");
            idx = 0;
        }
        return line[idx++];
    }
    
    public long nextLong() throws IOException, NumberFormatException {
        return Long.parseLong(nextToken());
    }
    
    public int nextInt() throws NumberFormatException, IOException {
        return (int) nextLong();
    }
    
    public double nextDouble() throws NumberFormatException, IOException {
        return Double.parseDouble(nextToken());
    }
}