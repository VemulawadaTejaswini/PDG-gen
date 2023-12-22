import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String KX = scanner.nextLine();

		int K = Integer.parseInt(KX.split(" ")[0]);

		int X = Integer.parseInt(KX.split(" ")[1]);

		//ArrayList<Integer> baseNumArray = new ArrayList<Integer>();

		String output = "";

		for(int i = ( X - K) + 1;i < (X + K);i++) {
			output=output + i + " ";
		}

		String output2 =  output.substring(0,output.length()-1);

		System.out.println(output2);

	}

}