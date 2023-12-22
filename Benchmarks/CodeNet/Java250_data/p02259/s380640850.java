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

		a = bubbleSort(a, n);

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

	static int[] bubbleSort(int[] a, int n){

		for(int j = 0; j < (n - 1); j++){
			for(int i = (n - 1); i > 0; i--){

				if(a[i] < a[i - 1]){
					COUNT++;
					int temp = a[i];
					a[i] = a[i - 1];
					a[i - 1] = temp;		
				}
				
			}
		}

		return a;

	}

}