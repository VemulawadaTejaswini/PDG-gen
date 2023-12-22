import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	//C問題

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Scanner scan = new Scanner(System.in);

		String input = br.readLine();

		//Sは SUN,MON,TUE,WED,THU,FRI,SAT のいずれか

		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("SUN", 0);
		map.put("MON", 1);
		map.put("TUE", 2);
		map.put("WED", 3);
		map.put("THU", 4);
		map.put("FRI", 5);
		map.put("SAT", 6);

		System.out.println(7 - map.get(input));
	}

}