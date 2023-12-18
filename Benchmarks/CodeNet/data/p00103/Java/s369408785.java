import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class BaseballSimulation {

	/**
	 * @param args
	 * @throws IOException
	 * @throws NumberFormatException
	 */

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int set, outcount, runs, first, second, third;
		String event;
		List<Integer> list = new ArrayList<Integer>();

		set = Integer.parseInt(bufferedReader.readLine());

		for(int i = 0; i < set; i++){
			outcount = runs = first = second = third = 0;
			while (outcount < 3) {
				event = bufferedReader.readLine();
				if (event.equals("HIT")){
					if(third == 1){
						third = 0;
						runs++;
					}
					if(second == 1){
						second = 0;
						third = 1;
					}
					if(first == 1){
						first = 0;
						second = 1;
					}
					first = 1;
				}else if(event.equals("HOMERUN")){
					runs += (first + second + third + 1);
					first = second = third = 0;
				}else if(event.equals("OUT")){
					outcount++;
				}
			}
			list.add(runs);
		}
		for(int value : list) System.out.println(value);
	}
}