import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	
	void run() throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		String[] stringArray = br.readLine().split(" ");
		int[] lineArray = new int[N];
		for(int i = 0; i < lineArray.length; i++) {
			lineArray[i] = Integer.parseInt(stringArray[i]);
		}
		editLine(lineArray);
		insertionSort(lineArray, N);
	}
	
	void insertionSort(int[] A, int N) {
	   for(int i = 1; i <= N - 1; i++) { 
	     int v = A[i];
	     int j = i - 1;
	     while(j >= 0 && A[j] > v) {
	     	A[j+1] = A[j];
	     	j--;
	     	A[j+1] = v;
	     }
	   editLine(A);
	   }
	}
	
	void editLine(int[] A) {
		for(int k = 0; k < A.length; k++) { 
			if(k != A.length - 1) {
				System.out.print(A[k] + " ");
			} else {
				System.out.println(A[k]);
			}
		}
	}

	public static void main(String[] args) throws IOException {
		new Main().run();
	}
}