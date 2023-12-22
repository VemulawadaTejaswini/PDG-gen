
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Main {
	public static void main(String[] args) throws IOException {
		ArrayList<Integer> heights = new ArrayList<Integer>();
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		for (int i = 0; i < 10; i++) {
			int h = Integer.parseInt(br.readLine());
			
			heights.add(h);
		}
		
		Collections.sort(heights);
		Collections.reverse(heights);
		
		for (int i = 0; i < 3; i++) {
			System.out.println(heights.get(i));
		}
	}
}