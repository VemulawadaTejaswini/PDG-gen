import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		ArrayList<Integer> arrPost = new ArrayList<Integer>();
		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		while(true) {
			int n = Integer.parseInt(buffReader.readLine());

			if(n == 0) 	break;
			else 		arrPost.add(n);
		}

		for(int i = 0; i < arrPost.size(); i++) System.out.println("Case " + (i + 1) + ": " + arrPost.get(i));
	}
}