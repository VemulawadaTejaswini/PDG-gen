import java.util.*;
import java.io.*;
class Main{
    //番兵
    
    public static void main(String[] args){
	
	InputStream stream = System.in;
	InputReader input = new InputReader(stream);
	int N = input.nextInt();
	int[] A = new int[N+1];
	int[] B = new int[N+1];
	for(int i = 0;i < N;i++){
	    A[i+1] = input.nextInt();
	}
	CountingSort(A,B,20000);
	PrintWriter out = new PrintWriter(System.out);
	for (int i = 1; i < N; i ++) {
	    out.print(B[i] + " ");
	}
	out.println(B[N]);
	
	out.flush();
	out.close();
    }
    
    public static void CountingSort(int[] A,int[] B,int k){
	int[] C = new int[k + 1];
	// for(int i = 0;i < k;i++){
	//     C[i] = 0;
	// }
	for(int j = 1;j < A.length;j++){
	    C[A[j]]++;
	}
	
	for(int i = 1;i <= k;i++){
	    C[i] += C[i-1];
    	}
	
	for(int j = A.length - 1;j >= 0;j--){
	    B[C[A[j]]] = A[j];
    	    C[A[j]]--;
	}
	//print(B);
    }
}
    // public static void print(int[] B){
    // 	for(int i = 0;i < B.length;i++){
    // 	    if(i != 1){
    // 		System.out.print(" ");
    // 	    }
    // 	    System.out.print(B[i]);
    // 	}
    // 	System.out.println();
    // }

class InputReader{
    public BufferedReader reader;
    public StringTokenizer tokenizer;
    //InputReaderクラスのコンストラクタ
    public InputReader(InputStream stream){
	reader = new BufferedReader(new InputStreamReader(stream),32768);
	tokenizer = null;	
    }
    public String next(){
	while (tokenizer == null || !tokenizer.hasMoreTokens()){
	    try{
		tokenizer = new StringTokenizer(reader.readLine());	    
	    }catch(IOException e){
		throw new RuntimeException(e);
	    }
	}
	return tokenizer.nextToken();
    }
    public int nextInt(){
	return Integer.parseInt(next());
    }
    
}

// import java.util.*;
// import java.io.*;

// public class Main {
//     public static void main(String[] args) {		
// 	int n = nextInt();
// 	int[] A = new int[n];
// 	int[] B = new int[n];
	
// 	for (int i = 0; i < n; i ++) {
// 	    A[i] = nextInt();
// 	}
	
// 	countingSort(A, B, 10000);
	
// 	PrintWriter out = new PrintWriter(System.out);
// 	for (int i = 0; i < n - 1; i ++) {
// 	    out.print(B[i] + " ");
// 	}
// 	out.println(B[n - 1]);
// 	out.flush();
// 	out.close();
//     }
    
//     public static void countingSort(int[] A, int[] B, int k) {
// 	int[] C = new int[k + 1];
	
// 	for (int i = 0; i < A.length; i++) {
// 	    C[A[i]]++;
// 	}
	
// 	for (int i = 1; i <= k; i++) {
// 	    C[i] += C[i - 1];
// 	}
	
// 	for (int i = A.length - 1; i >= 0; i--) {
// 	    B[C[A[i]] - 1] = A[i];
// 	    C[A[i]]--;
// 	}
//     }
    
//     private static byte[] buf = new byte[1 << 20];
//     private static int len = 0;
//     private static int ptr = 0;
    
//     private static byte read() {
// 	if (ptr >= len) {
// 	    try {
// 		len = System.in.read(buf);
// 	    } catch (Exception e) {
// 	    }
// 	    ptr = 0;
// 	}
	
// 	return buf[ptr++];
//     }
    
//     private static int nextInt() {
// 	int num = 0;
	
// 	byte b = read();
// 	while(!Character.isDigit(b)) b = read();
// 	while(Character.isDigit(b)) {
// 	    num *= 10;
// 	    num += b - '0';
// 	    b = read();
// 	}
	
// 	return num;
//     }
// }



// import java.util.*;
// import java.io.*;
// class Main{
//     //番兵
    
//     public static void main(String[] args){
	
// 	InputStream stream = System.in;
// 	InputReader input = new InputReader(stream);
// 	int N = input.nextInt();
// 	int[] A = new int[N];
// 	int[] B = new int[N];
// 	for(int i = 0;i < N;i++){
// 	    A[i] = input.nextInt();
// 	}
// 	CountingSort(A,B,20000);
// 	PrintWriter out = new PrintWriter(System.out);
// 	for (int i = 0; i < N - 1; i ++) {
// 	    out.print(B[i] + " ");
// 	}
// 	out.println(B[N - 1]);
// 	out.flush();
// 	out.close();
//     }
    
//     public static void CountingSort(int[] A,int[] B,int k){
// 	int[] C = new int[k + 1];
// 	// for(int i = 0;i < k;i++){
// 	//     C[i] = 0;
// 	// }
// 	for(int j = 0;j < A.length;j++){
// 	    C[A[j]]++;
// 	}
	
// 	for(int i = 1;i <= k;i++){
// 	    C[i] += C[i-1];
//     	}
	
// 	for(int j = A.length - 1;j >= 0;j--){
// 	    B[C[A[j]] - 1] = A[j];
//     	    C[A[j]]--;
// 	}
// 	//print(B);
//     }
// }
//     // public static void print(int[] B){
//     // 	for(int i = 0;i < B.length;i++){
//     // 	    if(i != 1){
//     // 		System.out.print(" ");
//     // 	    }
//     // 	    System.out.print(B[i]);
//     // 	}
//     // 	System.out.println();
//     // }

// class InputReader{
//     public BufferedReader reader;
//     public StringTokenizer tokenizer;
//     //InputReaderクラスのコンストラクタ
//     public InputReader(InputStream stream){
// 	reader = new BufferedReader(new InputStreamReader(stream),32768);
// 	tokenizer = null;	
//     }
//     public String next(){
// 	while (tokenizer == null || !tokenizer.hasMoreTokens()){
// 	    try{
// 		tokenizer = new StringTokenizer(reader.readLine());	    
// 	    }catch(IOException e){
// 		throw new RuntimeException(e);
// 	    }
// 	}
// 	return tokenizer.nextToken();
//     }
//     public int nextInt(){
// 	return Integer.parseInt(next());
//     }
    
// }


