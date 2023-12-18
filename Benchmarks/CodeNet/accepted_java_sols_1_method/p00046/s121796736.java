import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;


public class Main {
	
	public static void main(String[] args) throws Exception {
		List<Double> hList = new ArrayList<Double>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String var;
		while ((var = br.readLine()) != null) {
			double h = Double.parseDouble(var);
			hList.add(h);
		}
		Collections.sort(hList);
		double hMin = (Double) hList.get(0);
		double hMax = (Double) hList.get(hList.size() - 1);
		
		System.out.println(hMax - hMin);
	}
}