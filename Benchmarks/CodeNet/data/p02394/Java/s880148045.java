import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
	    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
			br.close();
		} catch (IOException e) {
		}
		String[] WHxyr = input.split(" ");

		int W = Integer.parseInt(WHxyr[0]);
		int H = Integer.parseInt(WHxyr[1]);
		int x = Integer.parseInt(WHxyr[2]);
		int y = Integer.parseInt(WHxyr[3]);
		int r = Integer.parseInt(WHxyr[4]);
		
		if(W >= (x + r) && H >= (y + r) && 0 <= (x - r) && 0 <= (y - r)){
		    System.out.println("Yes");
		}else{
		    System.out.println("No");
		}
	}
}
