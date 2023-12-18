import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			List<Integer> list = new ArrayList<Integer>();
			int counter = 0;
			while(sc.hasNextLine()) {
				if(counter >= 200) {
					System.out.println("you can enter only 200 datasets");
					sc.close();
					break;
				}
				int[] array = Arrays.stream(sc.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
				if(array.length != 2 || array[0] <= 0 || array[1] >= 1000000) {
					System.out.println("you can enter only 2 numbers");
					sc.close();
					break;
				}
				
				list.add(String.valueOf(array[0] + array[1]).length());
				counter++;	
			}
			for(Integer i : list) {
				System.out.println(i);
			}

	}
}