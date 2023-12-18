import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int value = 100000;
		int count = Integer.parseInt(br.readLine());
		
		for (int i = 0; i < count; i++) {
			value *= 1.05;
			if(value % 1000 == 0){
				value /= 1000;
				value *= 1000;
			}else{
				value /= 1000;
				value++;
				value *= 1000;
			}
		}
		System.out.println(value);
	}
}