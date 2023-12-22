import java.io.*;

public class Main {

	public static void main(String[] args) {
		try{
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int length = Integer.parseInt(br.readLine());
			String[] str = br.readLine().split(" ");
			
			int[] array = new int[length];
			for (int i = 0 ; i< length ; i++){
				array[i] = Integer.parseInt(str[i]);
			}
			
			InsertionSort.Sort(array);
			
		}catch(Exception e){
			System.out.println("??¨??????");
		}
	}
}

class InsertionSort{

	static void Sort(int[] array){
		for (int i = 0 ; i< array.length ; i++){
			OneSort(array,i);
			Display(array);
		}
	}
	
	static void OneSort(int[] array, int index){
		int v = array[index];
		while (index != 0 && array[index-1] > v){
			array[index] = array[index-1];
			index--;
		}
		array[index] = v;
	}
	
	static void Display(int[] array){
		
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < array.length-1; i++){
			sb.append(Integer.toString(array[i]));
			sb.append(" ");
		}
		sb.append(Integer.toString(array[array.length-1]));
		System.out.println(sb.toString());
	}
}