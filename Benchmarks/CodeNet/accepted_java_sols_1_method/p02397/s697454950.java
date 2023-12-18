import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	public static void main(String[] args)throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		for(int i = 1; i <=3000; i++){
			String inputData = br.readLine();
			String[] inputValue = inputData.split(" ");

			int x = Integer.parseInt(inputValue[0]);
			int y = Integer.parseInt(inputValue[1]);

			if(x == 0 && y == 0){
				break;
			}else{
				int[] outputValue = {x, y};
				Arrays.sort(outputValue);
				System.out.println(outputValue[0] + " " + outputValue[1]);
			}
		}
	}

}