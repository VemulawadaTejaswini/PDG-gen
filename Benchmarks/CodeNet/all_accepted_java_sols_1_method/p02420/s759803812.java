

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);
		ArrayList<String> list = new ArrayList<>();

		while(true){

			StringBuilder str = new StringBuilder(in.next());

			if(str.substring(0).equals("-")){

				break;

			}else{

			int shuffle_num = in.nextInt();

				for(int i = 0; i < shuffle_num; i++){

					int card_num = in.nextInt();

					String shuffle_word = str.substring(0, card_num);

					str.delete(0, card_num);

					str.append(shuffle_word);

				}
			}

			list.add(str.toString());

		}

		for(String result: list){

			System.out.println(result);

		}
	}
}