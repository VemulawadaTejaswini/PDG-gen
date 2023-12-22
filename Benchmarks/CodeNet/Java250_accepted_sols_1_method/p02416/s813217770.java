import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {


		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));


		for(;;){

			int sum =0;

			String[] input = br.readLine().split("");

			if(input[0].equals("0")){break;}

			for(int i=0;i<input.length;i++){

				sum += Integer.parseInt(input[i]);


			}System.out.println(sum);



		}



		//??????

	}
}