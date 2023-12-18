import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;


public class Main{

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<String> array = new ArrayList<String>();

		try {
			String str = null;
			while ((str = br.readLine()) != null) {
				array.add(str);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				br.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
		
		int N = Integer.parseInt(array.get(0));
		int maxNumber = 0;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 1; i <= N; i++) {
			String[] data = array.get(i).split(" ");
			map.put(Integer.parseInt(data[0]), Integer.parseInt(data[1]));
			if(maxNumber == 0 || (map.get(i) > map.get(maxNumber))) {
				maxNumber = i;
			} else if((map.get(i) == map.get(maxNumber)) && i < maxNumber){
				maxNumber = i;
			}
		}
		System.out.println(maxNumber + " " + map.get(maxNumber));
	}
}