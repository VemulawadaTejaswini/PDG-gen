import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Integer> list =new ArrayList<Integer>();
		String[] strings;

		while(sc.hasNext()){
			strings = sc.nextLine().split(",");

			if(Double.parseDouble(strings[1]) / Math.pow(Double.parseDouble(strings[2]), 2) >= 25){
				list.add(Integer.parseInt(strings[0]));
			}
		}

		for (int value : list) {
			System.out.println(value);
		}
	}
}