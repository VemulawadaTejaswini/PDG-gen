import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		double sum = 100000;   //????????????10??????
		int ??? = 0;			//?????????????????±???

		??? = Integer.parseInt(br.readLine());

		for(int i = 0; i < ???; i++){
			sum = sum * 1.05;
			sum = sum / 1000;
			sum = Math.ceil(sum) * 1000;
		}

		System.out.println(sum);
	}
}