import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader buffReader = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Integer> arrIntA = new ArrayList<Integer>();
		ArrayList<Integer> arrIntB = new ArrayList<Integer>();

		while(true) {
			String[] strNumbers = buffReader.readLine().split(" ");
			int a = Integer.parseInt(strNumbers[0]);
			int b = Integer.parseInt(strNumbers[1]);

			if(a == b && a == 0) break;

			if(b < a) {
				int tmp = a;
				a = b;
				b = tmp;
			}

			arrIntA.add(a);
			arrIntB.add(b);
		}

		for(int i = 0; i < arrIntA.size(); i++) System.out.println(arrIntA.get(i) + " " + arrIntB.get(i));
	}
}