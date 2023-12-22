import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		int counter = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNum = br.readLine().split(" ");
		int a = Integer.parseInt(inputNum[0]);
		int b = Integer.parseInt(inputNum[1]);
		int c = Integer.parseInt(inputNum[2]);

		for(int i = a; i<= b ; i++){
			if(c%i == 0){
				counter++;
			}
		}
		System.out.println(counter);
	}

}