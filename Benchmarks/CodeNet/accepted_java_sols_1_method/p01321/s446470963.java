import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int n;
		List<Integer[]> list = new ArrayList<Integer[]>();


		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		while((n = Integer.parseInt(bufferedReader.readLine())) != 0){
			int sum = 0, max = 0, min = 500;
			for(int i = 0; i < n; i++){
				sum = 0;
				String[] valueStrings = bufferedReader.readLine().split(" ");
				for(String s : valueStrings) sum += Integer.parseInt(s);

				max = max < sum ? sum : max;
				min = sum < min ? sum : min;
			}
			list.add(new Integer[]{new Integer(max), new Integer(min)});
		}
		for(Integer[] integer : list) System.out.println(integer[0].intValue()+" "+ integer[1].intValue());

	}
}