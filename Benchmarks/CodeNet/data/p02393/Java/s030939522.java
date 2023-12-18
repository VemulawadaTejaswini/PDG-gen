import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		String[] resultArray = str.split(" ");
		int[] box = new int[3];
		
		for (int i = 0; i < resultArray.length; i++) {
			
			box[i] = Integer.parseInt(resultArray[i]);
		
		}
		for (int i = 0; i < box.length-1; i++) {
			for (int j = i+1; j < box.length; j++) {
				if (box[i] > box[j]) {
					int tmp = box[j];
					box[j] = box[i];
					box[i] = tmp;
				}
			}
		}
		System.out.println(box[0] + " " + box[1] + " " + box[2]);
	}
}