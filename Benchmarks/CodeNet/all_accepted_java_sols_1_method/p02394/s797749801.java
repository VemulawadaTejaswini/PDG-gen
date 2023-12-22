import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		try {
			String input = br.readLine();
			String[] splitInput = input.split(" ");

			int W = Integer.parseInt(splitInput[0]);
			int H = Integer.parseInt(splitInput[1]);
			int x = Integer.parseInt(splitInput[2]);
			int y = Integer.parseInt(splitInput[3]);
			int r = Integer.parseInt(splitInput[4]);
			
			if (
					!(
					       (x >= -100 && y <= 100)
					    && (y >= -100 && y <= 100)
					    && (W >=    0 && W <= 100)
					    && (H >=    0 && H <= 100)
					    && (r >=    0 && r <= 100)
				     )
				) {
				throw new IllegalArgumentException();
			}
			
			int intialW = 0;
			int intialH = 0;
			
			String ans;
			if (((y - r) < intialH || (y - r) > H)) {
				ans = "No";
			} else if (((y + r) < intialH || (y + r) > H)) {
				ans = "No";
			} else if (((x - r) < intialW || (x - r) > W)) {
				ans = "No";
			} else if (((x + r) < intialW || (x + r) > W)) {
				ans = "No";
			} else {
				ans = "Yes";
			}
			
			System.out.println(ans);

			
			
		
		} catch(NumberFormatException e) {
			e.printStackTrace();
		} catch(IllegalArgumentException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}