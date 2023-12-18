/*
    Arnab Chanda 
*/
 
// All imports here
 
import java.io.InputStreamReader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.InputStream;
import java.util.*;
import java.util.stream.Collectors;
 
// Template code starts here //
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
public class Main {
	public static void main(String[] args) {
		InputStream inputStream = System.in;
		OutputStream outputStream = System.out;
		InputReader in = new InputReader(inputStream);
        PrintWriter out = new PrintWriter(outputStream);
        Debugger debug = new Debugger(out);
        Objectify objectify = new Objectify(debug);
        Task solver = new Task();
        int test = 1;
        while(test-->0){
            out.println(solver.solve(1, in, out, debug, objectify));
        }
		out.close();
	}
}
 
class InputReader {
    public BufferedReader reader;
    public StringTokenizer tokenizer;
 
    public InputReader(InputStream stream) {
        reader = new BufferedReader(new InputStreamReader(stream));
        tokenizer = null;
    }
 
    public String next() {
        while (tokenizer == null || !tokenizer.hasMoreTokens()) {
            try {
                tokenizer = new StringTokenizer(reader.readLine());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        return tokenizer.nextToken();
    }
 
    public int nextInt() {
        return Integer.parseInt(next());
    }
 
    public long nextLong() {
        return Long.parseLong(next());
    }
 
    public Double nextDouble() {
        return Double.parseDouble(next());
    }
 
    public float nextFloat() {
        return Float.parseFloat(next());
    }
 
}
 
class Debugger{
    PrintWriter out;
 
    Debugger(PrintWriter out){    
        this.out = out;
    }
 
    public <T> void printList(List<T> arrayList){
        for( Object ob: arrayList){
            out.print(ob+" ");
        }
        out.println();
    }
 
    public <T> void printSet(Set<T> set){
        for(Object ob: set){
            out.print(ob+" ");
        }
        out.println();
    }
 
    public <T> void printMap(Map<?,?> map){
        for(Object ob: map.keySet()){
            System.out.println(ob+" : "+map.get(ob));
        }
    }
}
 
class Objectify{
    
    Debugger debug;
 
    Objectify(Debugger ob){ debug = ob; }
 
    public void printArr(int[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(double[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(long[] arr){ debug.printList(Arrays.stream(arr).boxed().collect(Collectors.toList())); }
    public void printArr(char[] arr){ debug.printList( String.valueOf(arr).chars().mapToObj(c -> (char) c).collect(Collectors.toList())); }
    public void printArr(String[] arr){ debug.printList(Arrays.asList(arr)); }
 
    public void printMatrix(int[][] arr){ for(int a[]:arr) printArr(a); }
    public void printMatrix(double[][] arr){ for(double a[]:arr) printArr(a); }
    public void printMatrix(long[][] arr){ for(long a[]:arr) printArr(a); }
    public void printMatrix(char[][] arr){ for(char a[]:arr) printArr(a); }
    public void printMatrix(String[][] arr){ for(String a[]:arr) printArr(a); }
 
}
 
//////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
 
// Template code ends here
 
 
class Task {
 
    final long MOD = (int)Math.pow(10,9)+7;
 
    public long solve(int testNumber, InputReader sc, PrintWriter out, Debugger debug, Objectify objectify) {
        
        // out.println(-1);
        // write your code here
        int N = sc.nextInt();
        int A[] = new int[N+1];
 
        for(int  i = 0; i <= N; i++){
            A[i] = sc.nextInt();
        }
 
        // long[] max = new long[n+1];
        // max[0] = 1;
 
        // if(arr[0] == 1){
        //     out.println(-1);
        //     return;
        // }
 
        // for(int i = 1; i <= n; i++){
        //     max[i] = max[i-1]*2 - arr[i-1]*2;
        //     if (max[i] < 0 || (arr[i] > max[i])){
        //         out.println(-1);
        //         return;
        //     }
        // }
        // // objectify.printArr(max);
        // int ans = arr[n];
        // int last = arr[n];
        // for(int i = n-1; i >= 0; --i){
        //     last = (int)Math.min(max[i], arr[i]+last);
        //     ans+=last;
        // }
 
        // out.println(ans);
 
 
        long[] maxNode = new long[N+1];
        maxNode[0] = 1;
        for (int i=1; i<N+1; i++) {
            maxNode[i] = Math.min((maxNode[i-1]-A[i-1])*2, Long.MAX_VALUE/2);
 
            // System.err.println("check i=" + i + ", max=" + maxNode[i]);
            if (maxNode[i] < 0 || (A[i] > maxNode[i])) return -1;
        }
 
 
        long count = A[N];
        long childNode = A[N];
        // System.err.println("i=" + N + ", count=" + count + ", max=" + maxNode[N] + ", leaf=" + A[N] + ", child=" + childNode);
        for (int i=N-1; i>=0; i--) {
            // count += A[i];
            childNode = Math.min(maxNode[i], childNode+A[i]);
            count+=childNode;
            // System.err.println("i=" + i + ", count=" + count + ", max=" + maxNode[i] + ", leaf=" + A[i] + ", child=" + childNode);
        }
 
        if (childNode != 1) return -1;
 
        return count;
 
    }
}