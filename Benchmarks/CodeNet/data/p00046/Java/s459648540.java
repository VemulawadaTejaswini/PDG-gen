import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		List<Double> list = new ArrayList<Double>();

		String str = "";
		while((str=br.readLine())!=null){

			list.add(Double.parseDouble(str));
		}


		Collections.sort(list);

		System.out.println(list.get(list.size() - 1) - list.get(0));
	}

}