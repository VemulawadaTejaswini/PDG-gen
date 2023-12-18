import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
	public static long cnt = 0;
	public static ArrayList<Integer> G = new ArrayList<>();
	public static void insertitionSort(int[] A, int n, int g) {
		for(int i = g; i < n; i++) {
			int v = A[i];
			int j = i - g;
			while(j >= 0 && A[j] > v) {
				A[j + g] = A[j];
				j -= g;
				cnt++;
			}
			A[j + g] = v;
		}
	}
	public static void shellSort(int[] A, int n) {
		for(int h = 1; h <= n;h = h*3 + 1) G.add(h);
		for(int i = G.size()-1; i >= 0; i--) {
			insertitionSort(A,n,G.get(i));
		}
	}
	public static void main(String[] args) throws IOException {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(buffer.readLine());
		int[] array = new int[n];
		for(int i = 0; i < n; i++) array[i] = Integer.parseInt(buffer.readLine());

		shellSort(array,n);
		System.out.println(G.size());
		for(int i=G.size()-1;i >=0;i--) {
			System.out.printf("%d", G.get(i));
			if(i!=0) System.out.printf(" ");
		}
		System.out.printf("\n");
		System.out.printf("%d\n", cnt);
		StringBuilder output = new StringBuilder();
		output.append(array[0]);
		for(int i=1;i<n;i++) output.append("\n").append(array[i]);
		System.out.println(output.toString());
	}
}
