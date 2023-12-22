
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {

		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		String keyword = input.readLine();

		String str_containing_key = "";

		int count=0;



		while (true) {

			str_containing_key = input.readLine();

			if (str_containing_key.equals("END_OF_TEXT")) {

				break;

			}

			String []str_array=str_containing_key.split(" ");

			for(int array_spot=0; array_spot<str_array.length; array_spot++){


			if(str_array[array_spot].equalsIgnoreCase(keyword)){

				count++;
			}
			}

		}

		System.out.println(count);
	}
}//??§???????°?????????????????°????????????????????????????