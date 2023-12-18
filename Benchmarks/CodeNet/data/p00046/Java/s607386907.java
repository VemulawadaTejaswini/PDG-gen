import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		List<Double> height = new ArrayList<>();
		while (str!=null) {
			double h = Double.parseDouble(str);
			height.add(h);
			str = br.readLine();
		}
		int length = height.size();
		double[] heightarray = new double[length];
		for (int i = 0; i < length; i++) {
			heightarray[i] = height.get(i);
		}
		for (int i = 0; i < length - 1; i++) {
			for (int j = i + 1; j < length; j++) {
				double temporary;
				if (heightarray[i] < heightarray[j]) {
					temporary = heightarray[i];
					heightarray[i] = heightarray[j];
					heightarray[j] = temporary;
				}
			}
		}
		System.out.println(heightarray[0] - heightarray[length - 1]);
	}
}