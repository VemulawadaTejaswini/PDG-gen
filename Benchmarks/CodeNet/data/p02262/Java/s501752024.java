import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static int COUNT = 0;

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];

		for(int i = 0; i < n; i++){

			a[i] = Integer.parseInt(br.readLine());

		}

		Main m = new Main();
		m.shellSort(a, n);

		System.out.println(COUNT);

		for(int i = 0; i < n; i++){
			System.out.println(a[i]);
		}


	}

	public void insertionSort(int[] a, int n, int g){

		for(int i = g; i < n; i++){

			int temp = a[i];
			int j = i - g;

			while(j >= 0 && a[j] > temp){

				a[j + g] = a[j];
				j -= g;
				COUNT++;

			}

			a[j + g] = temp;

		}

	}

	public void shellSort(int[] a, int n){

		int m = 0;
		int s = 0;
		int[] g = new int[100];

		while(s < n){

			m++;
			s = (int)Math.pow(2, m) - 1;
			g[m - 1] = s;

		}

		System.out.println(m);

		for(int i = m - 1; i >= 0; i--){

			System.out.print(g[i]);

			if(i != 0){
				System.out.print(" ");
			}else{
				System.out.print("\n");
			}

		}

		for(int i = 0; i < m; i++){

			insertionSort(a, n, g[i]);

		}

	}
}