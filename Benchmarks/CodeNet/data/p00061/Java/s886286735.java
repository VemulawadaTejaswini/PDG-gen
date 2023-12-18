import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
	private Scanner sc;
	
	public static void main(String[] args) {
		new Main();
	}
	
	public Main() {
		sc = new Scanner(System.in);

		HashMap<Integer, Integer> data = new HashMap<Integer, Integer>();
		
		String line = sc.nextLine();
		while (line.equals("0,0") == false) {
			String[] nico = line.split(",");
			
			Integer[] tmp = new Integer[nico.length];
			for (int i = 0; i < nico.length; i++) {
				tmp[i] = Integer.parseInt(nico[i]);
			}

			data.put(tmp[0], tmp[1]);
			
			line = sc.nextLine();
		}
		
		int[] scores = new int[data.size()];
		
		int index = 0;
		for (int key : data.keySet()) {
			scores[index] = data.get(key);
			index++;
		}
		Arrays.sort(scores);


		HashMap<Integer, Integer> number = new HashMap<Integer, Integer>();
		
		int pre = 0;
		int num = 0;
		for (int i = 0; i < scores.length; i++) {
			int tmp = scores[scores.length - i - 1];
			
			if ((pre == 0) || (tmp < pre)) {
				num++;
				number.put(tmp, num);
			}
			
			pre = tmp;
		}
		
		while (sc.hasNextLine() == true) {
			int q = Integer.parseInt(sc.nextLine());
			System.out.println(number.get(data.get(q)));
		}
	}
}