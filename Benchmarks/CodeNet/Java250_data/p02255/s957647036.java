

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		int input[] = new int[100];
		int numOfInput;

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		numOfInput = Integer.parseInt(br.readLine());

		String tmpArray[] = br.readLine().split(" ");

		for(int i = 0; i < tmpArray.length ; i++){
			input[i] = Integer.parseInt(tmpArray[i]);
		}

		insertionSort(input, numOfInput);



	}

	public static void insertionSort(int[] array, int n){

		printArray(array, n);
		for(int i = 1; i <= n - 1; i++){
			int v = array[i];
			int j = i - 1;
			while (j >= 0 && array[j] > v){
				array[j+1] = array[j];
				j--;
			}
			array[j+1] = v;

			printArray(array, n);
		}
	}

	public static void printArray(int[] array, int n){
		for(int i = 0; i < n ; i++){
			System.out.print(array[i]);
			if(i < n - 1){
				System.out.print(" ");
			}
			else{
				System.out.println();
			}
		}
	}

}