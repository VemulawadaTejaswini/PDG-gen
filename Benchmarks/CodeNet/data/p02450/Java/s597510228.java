import java.io.*;
import java.util.*;

class Main{
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		PrintWriter pw = new PrintWriter(System.out);
		Scanner sc = new Scanner(System.in);
		String[] str = br.readLine().split(" ");
		int n = Integer.parseInt(str[0]);
		int[] a = new int[n];
		for(int i = 0; i < n; i++) a[i] = i + 1;
		printArray(a, pw);
		for(;;){
			int[] b = next_permutation(a);
			if(a == b) break;
			printArray(b, pw);
			a = b;
		}
		pw.close();
	}
	public static void printArray(int[] a, PrintWriter pw){
		for(int i = 0; i < a.length; i++){
			pw.print(a[i]);
			if(i != a.length - 1) pw.print(" ");
		}
		pw.print("\n");
	}
	public static int[] next_permutation(int[] a){
		int[] ret = new int[a.length];
		int front = -1, rear = -1;
		ArrayList<Integer> la = new ArrayList<Integer>();
		for(int i = a.length - 1; i >= 0; i--){
			if(i < a.length - 1 && a[la.get(la.size() - 1)] > a[i]){
				front = i;
				for(;;){
					rear = la.get(la.size() - 1);
					la.remove(la.size() - 1);
					if(la.isEmpty() || a[la.get(la.size() - 1)] < a[front]) break;
				}
				break;
			}
			else la.add(i);
		}
		if(front == -1) return a;
		for(int i = 0; i < a.length; i++){
			if(i == front) ret[i] = a[rear];
			else if(i == rear) ret[i] = a[front];
			else ret[i] = a[i];
		}
		Arrays.sort(ret, front + 1, a.length);
		return ret;
	}
}

