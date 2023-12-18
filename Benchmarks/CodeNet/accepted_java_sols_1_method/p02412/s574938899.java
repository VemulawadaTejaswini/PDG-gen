
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		while(true){

			int num = in.nextInt();
			int sum = in.nextInt();
			int count = 0;

			if(num == 0 && sum == 0){

				break;

			}else{

				for(int i = 1; i <= (num-2); i++){

					for(int j = i; j <= (num-2); j++){

						for(int k = j; k <= (num-2); k++){

							// ??°????¢????
							// String c = i + "+" + (j + 1) + "+" + (k + 2);
							// System.out.println(c);

							if(i + (j + 1) + (k + 2) == sum){

								count++;

							}
						}
					}
				}

				list.add(count);

			}
		}

		for(int result: list){

			System.out.println(result);

		}

	}
}