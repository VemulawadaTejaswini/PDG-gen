import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	private static void print()  {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int i = 1;
		try {
			while(true){

			String str = br.readLine();
			if(str.equals("0")){
				break;
			}

			System.out.println("Case " +  i + ": " + str);
			i++;
			}
		} catch (IOException e) {
			e.printStackTrace();
		}


	}

}