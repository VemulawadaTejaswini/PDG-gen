import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));

		try {
			String str = input.readLine();

			String[] strP = str.split(" ");

			for(int i = 0; i < strP.length; i++) {
				if(strP[i].equals("apple") || strP[i].equals("apple.")) {
					strP[i] = "peach";
				} else if(strP[i].equals("peach") || strP[i].equals("peach.")) {
					strP[i] = "apple";
				}
				
				System.out.print(strP[i] + " ");
			}
			
			System.out.println("");

		} catch (IOException e) {
			// TODO ????????????????????? catch ????????????
			System.out.println("halll");
		}

	}

}