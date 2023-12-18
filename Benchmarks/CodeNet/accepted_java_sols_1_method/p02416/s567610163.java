import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);


		while(true) {	//0が入力されたら終了

			//入力と同時に文字列を配列arrayに初期化
			String str = scanner.nextLine();

			if(str.equals("0")) {
				break;
			}

			int sum = 0;

			for(char a : str.toCharArray()) {


				sum += Integer.parseInt(String.valueOf(a));

			}

			System.out.println(sum);

		}
	}
}
