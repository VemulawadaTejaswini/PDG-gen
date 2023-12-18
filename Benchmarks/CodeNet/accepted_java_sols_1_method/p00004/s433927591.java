import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


class Main{
	
	public static void main(String[] args) throws NumberFormatException, IOException {
	
		int a, b, c, d, e, f;
		String input;
		BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
		
		
		while ((input = bf.readLine()) != null) {
			String[] dataset = input.split(" ");
			int i = 0;
			a = Integer.parseInt(dataset[i++]);
			b = Integer.parseInt(dataset[i++]);
			c = Integer.parseInt(dataset[i++]);
			d = Integer.parseInt(dataset[i++]);
			e = Integer.parseInt(dataset[i++]);
			f = Integer.parseInt(dataset[i++]);
			
			float y = ((float)(d * c - a * f)) / ((float)(d * b - a * e));
			float x = (c - b * y) / a;
			
			System.out.printf("%.3f ", x);
			System.out.printf(String.format("%.3f\n", y));
		}
	}
}