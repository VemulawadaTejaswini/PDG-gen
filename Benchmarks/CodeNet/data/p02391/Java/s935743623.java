import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = null;
		try {
			input = br.readLine();
			br.close();
		} catch (IOException e) {
		}

		String[] ab = input.split(" ");

		int a = Integer.parseInt(ab[0]);
		int b = Integer.parseInt(ab[1]);

		// a = 1,b = 1;
		if(a < b){
			System.out.println("a < b");
		}else if(a > b){
			System.out.println("a > b");
		}else{
			System.out.println("a == b");
		}


		/*
		if(a < b){
			System.out.println(a < b);
		}

		if(a > b){
			System.out.println(a > b);
		}

		if(a == b){
			System.out.println(a == b);
		}
		*/
	}
}
