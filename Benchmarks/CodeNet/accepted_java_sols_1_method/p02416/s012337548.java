

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();

		while(true){

			String number = in.next();
			int ans = 0;

			if(number.equals("0")){

				break;

			}else{

				String[] numbers = number.split("");

				for(int i = 0; i < numbers.length; i++){

					ans += Integer.parseInt(numbers[i]);

				}
			}

			list.add(ans);

		}

		for(int result: list){

			System.out.println(result);

		}
	}
}