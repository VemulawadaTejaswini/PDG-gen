import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringJoiner;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {
		int n = Integer.parseInt(br.readLine());
		
		int[] array = new int[n];
		for(int i = 0; i < n; i++){
			array[i] = Integer.parseInt(br.readLine());
		}
		
		shellSort(array);
	}
	
	public static int insertionSort(int[] array, int g){
		int count = 0;
		for(int i = g; i < array.length; i++){
			int v = array[i];
			int j = i - g;
			while(0 <= j && v < array[j]){
				array[j+g] = array[j];
				j -= g;
				count++;
			}
			array[j+g] = v;
		}
		
		return count;
	}
	
	public static void shellSort(int[] array){
		int count = 0;
		
		List<Integer> gList = new ArrayList<>();
		for(int i = 0; ; i++){
			int g = 3 * i + 1;
			if(g <= array.length){
				gList.add(g);
			}else{
				break;
			}
		}
		Collections.reverse(gList);
		for(int g: gList){
			count += insertionSort(array, g);
		}
		
		System.out.println(gList.size());
		StringJoiner sj = new StringJoiner(" ");
		gList.forEach(gv -> sj.add(String.valueOf(gv)));
		System.out.println(sj);
		System.out.println(count);
		Arrays.stream(array).forEach(System.out::println);
	}
}

