import java.util.Arrays;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int array[] = null;
		int count = 0;

		Scanner scanner = new Scanner(System.in);

		//入力値を扱いやすいように配列化
		for(int i = 0; scanner.hasNext(); i++) {
			if(i == 0) array = new int[Integer.parseInt(scanner.next())];

			array[i] = Integer.parseInt(scanner.next());
		}

		for(int i = 0; i < (array.length -2); i++) {
			
			//3個ずつ比較
			int temp[] = new int[] {array[i], array[i+1], array[i+2]};
			
			//照準ソート
			Arrays.sort(temp);
			
			//ソート前とソート後で真ん中の値を比較
			if(array[i+1] == temp[1]) count++;
			
		}

		System.out.print(count);

		scanner.close();
	}

}