import java.util.*;

public class Main{
	public static void main(String[] args){
		List<Integer, Integer> numSet = new ArrayList<Integer, Integer>();
		for(;;){
			String line = new Scanner(System.in).nextLine();
			if(line.equals("0 0")){
				break;
			}
			String[] numbers = line.split("\\s");
			int x = Integer.parseInt(numbers[0]);
			int y = Integer.parseInt(numbers[1]);

			if(x > y){
				int small = y;
				numbers[1] = numbers[0];
				numbers[0] = y;
			}
			numSet.add(numbers[0], numbers[1]);
		}

		int[][] array = numSet.toArray();
		for(int i = 0; i < array.length; i++){
			System.out.printf("%d %d\n", array[i][0], array[i][1]);
		}
	}
}