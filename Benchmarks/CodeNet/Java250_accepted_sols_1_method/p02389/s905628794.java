import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNumber = br.readLine().split(" ");

		int height =  Integer.parseInt(inputNumber[0]);
		int width =  Integer.parseInt(inputNumber[1]);
		int area = height * width;
		int totalLength = (height*2) + (width*2);
		System.out.println(area + " " + totalLength);
	}


}