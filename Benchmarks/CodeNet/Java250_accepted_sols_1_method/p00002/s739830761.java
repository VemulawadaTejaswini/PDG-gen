import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

class Main {
	public static void main(String[] args) {
		InputStreamReader is = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(is);
		ArrayList<Integer> output = new ArrayList<Integer>();
		String input;
		try {
			while ((input = br.readLine()) != null) {
				int a = Integer.parseInt(input.split(" ")[0]);
				int b = Integer.parseInt(input.split(" ")[1]);
				int c = a + b;
				output.add(Integer.toString(c).length());
			}
			for(int i: output){
				System.out.println(i);
			}
		} catch (IOException e) {
			System.out.println(e);
		}
	}
}