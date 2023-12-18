import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int n;
		List<String> 	mesList = new ArrayList<String>();
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		n = Integer.parseInt(bufferedReader.readLine());

		for(int i = 0; i < n; i++){
			mesList.add(bufferedReader.readLine());
		}

		for(String mes : mesList){
			mes.replaceAll("Hoshino", "Hoshina");
			System.out.println(mes);
		}
	}
}