import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		ArrayList<Double> list = new ArrayList<Double>();

		while(null != (str=br.readLine())){
			list.add(Double.parseDouble(str));
		}

		Collections.sort(list);

		System.out.println(list.get(list.size()-1) - list.get(0));
	}
}