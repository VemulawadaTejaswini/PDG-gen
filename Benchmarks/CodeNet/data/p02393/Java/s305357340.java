import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main{
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			List<Integer> ret = new ArrayList<Integer>();
			ret.add(Integer.parseInt(list[0]));
			ret.add(Integer.parseInt(list[1]));
			ret.add(Integer.parseInt(list[2]));
			Collections.sort(ret);
			String output = "";
			for (int num : ret) {
				output = output + num + " ";
			}
			System.out.println(output);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}