import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader input =new BufferedReader (new InputStreamReader (System.in));
		int n = Integer.parseInt(input.readLine( ));
		int i = 1;
		int sum = 0;
		while(sum < n){
			sum = sum + i;
			i++;
		}
		System.out.println(i-1);
	}

}
