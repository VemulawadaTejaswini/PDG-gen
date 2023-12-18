import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] inputNum = br.readLine().split(" ");
		int a = Integer.parseInt(inputNum[0]);
		int b = Integer.parseInt(inputNum[1]);
		int c = Integer.parseInt(inputNum[2]);

		int num[] = {a , b , c};

		Arrays.sort(num);

		System.out.println(num[0] + " " + num[1] + " " + num[2]);




	}

}