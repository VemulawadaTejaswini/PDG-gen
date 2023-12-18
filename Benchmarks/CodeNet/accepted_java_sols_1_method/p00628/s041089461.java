import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader reader =  new BufferedReader(new InputStreamReader(System.in));

		while(true){

			String mes = reader.readLine();

			if(mes.equals("END OF INPUT"))	break;

			String[]	lists = mes.split((" "));

			for(String len : lists) System.out.print(len.length());
			System.out.println();
		}
	}
}