import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
		String[] inputStr = null;
		int[] inputInt = null;
		while(true) {
			try {
				inputStr = (input.readLine()).split(" ");
				inputInt = new int[inputStr.length];
				for (int i = 0; i < inputInt.length; i++) {
					inputInt[i] = Integer.parseInt(inputStr[i]);
				}
				if(inputInt[0] == 0 && inputInt[1] == 0) {
					break;
				}
				for (int row = 0; row < inputInt[0]; row++) {
					for (int col = 0; col < inputInt[1]; col++) {
						if (((row % 2 != 0) && (col % 2 == 0)) || ((row % 2 == 0) && (col % 2 != 0)) ) {
							System.out.print(".");
						} else {
							System.out.print("#");
						}
					}
					System.out.println();
				}
				System.out.println();
			} catch (IOException e) {
				// TODO 自動生成された catch ブロック
				e.printStackTrace();
			}
		}
	}

}

