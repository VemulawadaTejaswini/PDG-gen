import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Double> list = new ArrayList<Double>();
		String str = "";
		while((str=br.readLine())!=null){
			list.add(Double.parseDouble(str));
		}
		Collections.sort(list);
		System.out.println(list.get(list.size()-1) - list.get(0));
	}
}