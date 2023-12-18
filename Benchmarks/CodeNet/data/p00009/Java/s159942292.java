import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	private static boolean isPrimeNumber(int number){

		if(number <= 2)		return true;
		if(number % 2 != 0)	return false;

		for(int i = 3; i * 2 <= number ;i += 2){
			if(number % i == 0)	return false;
		}

		return true;
	}
	public static void main(String[] args) throws NumberFormatException, IOException {

		int				counter = 0;
		BufferedReader 	reader = new BufferedReader(new InputStreamReader(System.in));
		String buff;

		while((buff = reader.readLine()) != null){
			counter = 0;
			int max = Integer.parseInt(buff);
			for(int i = 1; i <= max; i++){
				counter += isPrimeNumber(i) ? 1 : 0;
			}
			System.out.println(counter);
		}

	}
}