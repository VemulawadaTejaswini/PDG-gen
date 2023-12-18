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
            solver.solve(1, in, out, debug, objectify);
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
    int arr[];
    int mini[];

    public void solve(int testNumber, InputReader sc, PrintWriter out, Debugger debug, Objectify objectify) {
        
        // write your code here
        int n = sc.nextInt();
        int m = sc.nextInt();

        Map<Integer, List<Integer>> map = new HashMap<>();

        for(int i = 0; i < m; i++){
            int u = sc.nextInt();
            int v = sc.nextInt();

            if ( map.get(u) != null){
                map.get(u).add(v);
            }else{
                map.put(u, new ArrayList<>());
                map.get(u).add(v);
            }
            if ( map.get(v) != null){
                map.get(v).add(u);
            }else{
                map.put(v, new ArrayList<>());
                map.get(v).add(u);
            }
        }


        arr = new int[n+1];
        mini = new int[n+1];
        Arrays.fill(mini, Integer.MAX_VALUE);
        Arrays.fill(arr, -1);

        findPath(1, 0, map, 0);

        boolean flag = true;

        for(int i = 2; i <= n; i++){
            if (arr[i] == -1){
                flag = false;
                break;
            }
        }

        if (flag == false) 
            out.println("No");
        else{
            out.println("Yes");
            for(int i = 2; i <= n; i++){
                out.println(arr[i]);
            }
        }   
    }

    public void findPath(int node,int parent, Map<Integer, List<Integer>> map, int length){
        // System.out.println(node+" "+parent+" "+length);
        if (mini[node] < length) return;

        mini[node] = length;
        arr[node] = parent;

        for(int i: map.get(node)){
            if (i!=parent){
                findPath(i, node, map, length+1);
            }
        }
    }
}