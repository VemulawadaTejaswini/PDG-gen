import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
 
public class Main {
	private static final String CRLF = System.lineSeparator();
	public void exec() throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(System.out);
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        StringBuilder sb = new StringBuilder();
        int i=0;
        for(String s: br.readLine().split(" ")){
        	A[i++] = Integer.parseInt(s);
        }
        intArrayToString(A,sb);
        for(i=1; i<N; i++){
        	int v = A[i];
        	int j = i-1;
        	while(j>=0 && A[j]>v) {
        		A[j+1] = A[j];
        		j--;
        	}
        	A[j+1] = v;
            intArrayToString(A,sb);	
        }
        out.print(sb.toString());
        out.flush();
    }
	private void intArrayToString(int[] a, StringBuilder sb) {
		for(int i=0; i<a.length; i++) {
			if (i>0)
				sb.append(" ");
			sb.append(a[i]);
		}
        sb.append(CRLF);
	}
	
    public static void main(String[] args) throws IOException {
        new Main().exec();
    }
}