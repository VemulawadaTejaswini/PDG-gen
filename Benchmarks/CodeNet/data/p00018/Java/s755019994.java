import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0018_SortingFiveNumbers {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0018_SortingFiveNumbers test = new Problem0018_SortingFiveNumbers();
			Main test = new Main();
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			String line;
			while((line = reader.readLine()) != null) {
				String[] textArray = line.split(" ");
				int[] numbers = new int[5];
				for(int i = 0; i < numbers.length; i++) {
					numbers[i] = Integer.parseInt(textArray[i]);
				}
				test.sort(numbers);
				for(int i = 0; i < numbers.length-1; i++) {
					System.out.print(numbers[i] + " ");
				}
				System.out.println(numbers[numbers.length-1]);
			}
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void sort(int[] array) {
		int[] numbers = array;
		for(int i = 1; i < numbers.length; i++) {
			for(int j = i; j > 0; j--) {
				if(numbers[j-1] < numbers[j]) {
					int temporary = numbers[j];
					numbers[j] = numbers[j-1];
					numbers[j-1] = temporary;
				} else {
					break;
				}
			}
		}
	}
}