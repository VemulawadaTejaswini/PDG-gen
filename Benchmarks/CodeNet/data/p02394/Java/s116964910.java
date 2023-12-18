import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		String inputValue = br.readLine();
		String[] inputData = inputValue.split(" ");

		int width = Integer.parseInt(inputData[0]);
		int height = Integer.parseInt(inputData[1]);
		int x = Integer.parseInt(inputData[2]);
		int y = Integer.parseInt(inputData[3]);
		int r = Integer.parseInt(inputData[4]);

		if(r <= x && x <= (width - r) && r <= y && y <= (height - r)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}

}