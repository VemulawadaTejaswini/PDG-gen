import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

class Main{

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] input = br.readLine().split(" ");
		String[][] output = new String[2][n];

		for(int i = 0; i < n; i++){
			output[0][i] = input[i];
			output[1][i] = input[i];
		}

		bubbleSort(output[0], n);
		selectionSort(output[1], n);

		for(int j = 0; j < output.length; j++){

			for(int i = 0; i < n; i++){

				System.out.print(output[j][i]);

				if(i != (n - 1)){
					System.out.print(" ");
				}else{
					System.out.print("\n");
				}

			}

			if(isStable(input, output[j], n)){
				System.out.println("Stable");
			}else{
				System.out.println("Not stable");
			}
			
		}


	}

	public static void bubbleSort(String[] array, int n){

		for(int i = 0; i < (n - 1); i++){
			for(int j = (n - 1); j > 0; j--){

				int x = Character.getNumericValue(array[j].charAt(1));
				int y = Character.getNumericValue(array[j - 1].charAt(1));

				if(x < y){
					String temp = array[j - 1];
					array[j - 1] = array[j];
					array[j] = temp;
				}
				
			}
		}

	}

	public static void selectionSort(String[] array, int n){

		for(int i = 0; i < (n - 1); i++){

			int min = i;

			for(int j = (i + 1); j < n; j++){
				int x = Character.getNumericValue(array[j].charAt(1));
				int y = Character.getNumericValue(array[min].charAt(1));

				if(x < y){
					min = j;
				}
				
			}

			String temp = array[min];
			array[min] = array[i];
			array[i] = temp;
			
		}

	}

	public static boolean isStable(String[] before, String[] after, int n){

		for(int i = 0; i < (n - 1); i++){
			for(int j = (i + 1); j < n; j++){

				for(int a = 0; a < (n - 1); a++){
					for(int b = (a + 1); b < n; b++){

						int x = Character.getNumericValue(before[i].charAt(1));
						int y = Character.getNumericValue(before[j].charAt(1));

						if(x == y && before[i].equals(after[b]) && before[j].equals(after[a])){
							return false;
						}
						
					}
				}

			}
		}

		return true;

	}

}