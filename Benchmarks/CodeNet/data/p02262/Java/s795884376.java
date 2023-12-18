import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Arrays;
  
public class Main {
    private static final String CRLF = System.lineSeparator();
    public void exec() throws IOException {
    	SimpleInputUtil in = new SimpleInputUtil();
        PrintWriter out = new PrintWriter(System.out);
        StringBuilder sb = new StringBuilder();
        int n = in.readInt();
        int[] A = in.readIntArray(new int[n]);
        int cnt = shellSort(A,sb);
        sb.append(cnt).append(CRLF);
        intArrayToString1Line1Num(A,sb);
        out.print(sb.toString());
        out.flush();
    }
    
    private int insertionSort(int[] A, int g) {
    	int cnt=0;
    	int n = A.length;
    	for(int i=g; i<n; i++) {
    		int v = A[i];
    		int j = i - g;
    		while ( j >= 0 && A[j] > v ) {
    			A[j+g] = A[j];
    			j = j - g;
    			cnt++;
    		}
    		A[j+g] = v;
    	}
    	return cnt;
    }
    
    private int[] shellSortSub(int[] A, StringBuilder sb) {
    	int mInit=100; 
    	int[] G = new int[mInit];
    	G[0] = A.length/2;
    	int m = 0;
    	while(G[m]>1) {
    		m++;
    		G[m] = G[m-1]/2;
    	}
    	m++;
    	sb.append(m).append(CRLF);
    	int[] Gsub = Arrays.copyOf(G, m);
    	intArrayToString1LineAllNum(Gsub,sb);
    	return Gsub;
    }
    
    private int shellSort(int[] A,StringBuilder sb) {
    	int cnt=0;
    	int[] G = shellSortSub(A,sb);
    	for(int i=0; i<G.length; i++) {
    		cnt += insertionSort(A, G[i]);
    	}
    	return cnt;
    }
    
    private void intArrayToString1LineAllNum(int[] sorted, StringBuilder sb) {
        for(int i=0; i<sorted.length; i++) {
            if(i>0) sb.append(" ");
        	sb.append(sorted[i]);
        }
        sb.append(CRLF);
    }
    
    private void intArrayToString1Line1Num(int[] sorted, StringBuilder sb) {
        for(int i=0; i<sorted.length; i++) {
            sb.append(sorted[i]).append(CRLF);
        }
    }
     
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
    
}

class SimpleInputUtil {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public int readInt() throws NumberFormatException, IOException{
    	return Integer.parseInt(br.readLine());
    }
    public int[] readIntArray(int[] a) throws NumberFormatException, IOException{
        int i=0;
        while(i<a.length) {
            for(String s: br.readLine().split(" ")){
            	if(i<a.length) {
                    a[i++] = Integer.parseInt(s);
            	}
            }
        }
        return a;
    }
    
}