import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		for(;;){
			String input = null;

			try {
				input = br.readLine();
			} catch (IOException e) {
			}
			String[] inputs = input.split(" ");
			int h = Integer.parseInt(inputs[0]);
			int w = Integer.parseInt(inputs[1]);

			if(h == 0 && w == 0){
				break;
			}

			String line = "";

			for(int j = 0; j < w; j++){
				line += "#";
			}
			for(int i = 0; i < h; i++){
				System.out.println(line);
			}
			System.out.println("");
		}
	}
}

