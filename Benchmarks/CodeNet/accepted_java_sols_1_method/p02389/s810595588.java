import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String line = br.readLine();
		String[] oneline = line.split(" ");
		
		int[] data = {0,0};
		
		for(int i=0; i<oneline.length; i++){
			data[i] = Integer.parseInt(oneline[i]);
		}
		
		int area = data[0] * data[1];
		int length = 2 *(data[0]+data[1]);
		
		System.out.println(area +" "+ length);
	}
}