import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	public static void main(String[] args) {
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		try {
			String[] list = br.readLine().split(" ");
			List<Integer> ret = new ArrayList<Integer>();
			int i;
			for (i = 0; i < list.length; i++) {
				ret.add(Integer.parseInt(list[i]));
			}
			Collections.sort(ret);
			String output = "";
			for (int num : ret) {
				output = output + num + " ";
			}
			System.out.println(output.substring(0, output.length() - 1));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}