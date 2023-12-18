import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	static int COUNT = 0;

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		int[] a = new int[n];
		String[] input = br.readLine().split(" ");

		for(int i = 0; i < n; i++){
			a[i] = Integer.parseInt(input[i]);
		}

		a = selectionSort(a, n);

		for(int i = 0; i < n; i++){
			
			System.out.print(a[i]);

			if(i != (n - 1)){
				System.out.print(" ");
			}else{
				System.out.print("\n");
			}

		}

		System.out.println(COUNT);

	}

	static int[] selectionSort(int[] a, int n){

		for(int i = 0; i < (n - 1); i++){

			int min = i;

			for(int j = (i + 1); j < n; j++){

				if(a[j] < a[min]){
					min = j;
				}

			}

			if(min != i){
				COUNT++;
			}

			int temp = a[min];
			a[min] = a[i];
			a[i] = temp;

		}

		return a;

	}

}