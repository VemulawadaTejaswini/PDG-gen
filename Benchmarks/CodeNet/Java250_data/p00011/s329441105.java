import java.io.BufferedReader;
import java.io.InputStreamReader;

//public class Problem0011_DrawingLots {
public class Main {
	public static void main(String[] args) {
		try {
		//	Problem0011_DrawingLots test = new Problem0011_DrawingLots();
			Main test = new Main();
			
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			String line = reader.readLine();
			
			int volume = Integer.parseInt(line);
			int swappingCount = Integer.parseInt(reader.readLine());
			int[][] swaps = new int[swappingCount][2];
			
			for(int i = 0; i < swappingCount; i++) {
				line = reader.readLine();
				String[] textArray = line.split(",");
				for(int j = 0; j < 2; j++) {
					swaps[i][j] = Integer.parseInt(textArray[j]);
				}
			}
			test.showAnswer(volume, swaps);
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	void showAnswer(int number, int[][] arrays) {
		int[] numbers = new int[number];
		for(int i = 0; i < numbers.length; i++) {
			numbers[i] = i+1;
		}
		
		for(int[] array : arrays) {
			swap(numbers, array[0]-1, array[1]-1);
		}
		for(int positionNumber : numbers) {
			System.out.println(positionNumber);
		}
	}
	void swap(int[] target, int position1, int position2) {
		int temporary = target[position1];
		target[position1] = target[position2];
		target[position2] = temporary;
	}
}