import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));

			String[] strs = br.readLine().split(" ");
			List<Integer> l = new ArrayList<Integer>();
			for(String s:strs){
				l.add(Integer.parseInt(s));
			}
			Collections.sort(l);
			StringBuilder sb = new StringBuilder();
			for(int i:l){
				sb.append(i);
				sb.append(" ");
			}
			System.out.println(sb.substring(0,sb.length()-1));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}