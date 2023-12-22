import java.io.BufferedReader;
import java.io.InputStreamReader;

class Main{

	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] line = br.readLine().split(" ");
		int width = Integer.parseInt(line[0]);
		int height = Integer.parseInt(line[1]);
		int area = width * height;
		int length = (width * 2) + (height * 2);

		System.out.println(area + " " + length);

	}
}