import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] Args)throws IOException{
		BufferedReader br =
				new BufferedReader(new InputStreamReader(System.in));

		for(int i = 1; i <= 10000; i++){
			int inputValue = Integer.parseInt(br.readLine());

			if(inputValue != 0){
				System.out.println("Case " + i + ": " + inputValue);
			}else{
				break;
			}
		}
	}

}