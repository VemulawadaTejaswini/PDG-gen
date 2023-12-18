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
		String[] data = array.get(0).split(" ");
		int N = Integer.parseInt(data[0]);
		int count = Integer.parseInt(data[1]);
		
		int maxNumber = -1;
		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		for(int i = 1; i <= count; i++) {
			data = array.get(i).split(" ");
			int id = Integer.parseInt(data[0]);
			if(map.containsKey(id)) {
				map.put(id, Integer.parseInt(data[1]) + map.get(id));
				for(int j : map.keySet()) {
					if(map.get(j) > map.get(maxNumber) || (map.get(j) == map.get(maxNumber) && j < maxNumber) ) {
						maxNumber = j;
					}
				}
			} else {
				map.put(id, Integer.parseInt(data[1]));
				if(maxNumber == -1 || (map.get(id) > map.get(maxNumber))) {
					maxNumber = id;
				} else if((map.get(id) == map.get(maxNumber)) && id < maxNumber){
					maxNumber = id;
				}
			}
			
			System.out.println(maxNumber + " " + map.get(maxNumber));
		}
	}

}