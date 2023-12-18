import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
public class Main{

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Double> list = new ArrayList<Double>();
		String current;
        while((current=br.readLine())!=null){
			list.add(Double.parseDouble(current));
		}
        Collections.sort(list);
		System.out.println(list.get(list.size()-1) - list.get(0));
	}
}