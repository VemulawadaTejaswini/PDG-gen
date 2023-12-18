import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.math.*;
import java.util.ArrayList;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static int cnt=0;
	static ArrayList<Integer> G = new ArrayList<Integer>();

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int N = Integer.parseInt(br.readLine());
		int[] A = new int[N];
		for(int i=0;i<N;i++){
			A[i] = Integer.parseInt(br.readLine());
		}
		int tmp = 1;
		while(tmp<N){
			G.add(tmp);
			tmp=3*tmp+1;
		}
		int m =shellSort(A,N);
		System.out.println(m);
		tmp = 1;
		for(int i=m-1;i>=0;i--){
			if(i<m-1)
				System.out.print(" ");
			System.out.print(G.get(i));
		}
		System.out.print("\n");
		System.out.println(cnt);
		for(int i=0; i<N;i++){
			System.out.println(A[i]);
		}

	}
	
	static int shellSort(int[] A,int n){
		int m;
		m = G.size();
		for(int i=m-1; i>=0;i--)
			insertionSort(A, n, G.get(i));
		return m;
	}
	
	static void insertionSort(int[] A, int n, int g){
		int v,j;
		for(int i=g;i<n;i++){
			v = A[i];
			j=i-g;
			while (j>=0 && A[j] >v){
				A[j+g]=A[j];
				j=j-g;
				cnt++;
			}
			A[j+g] = v;

		}
	}
}