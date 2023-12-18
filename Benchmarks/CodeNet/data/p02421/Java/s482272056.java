

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tarou_point = 0,hanako_point = 0;

		Scanner in = new Scanner(System.in);

		int game_num =in.nextInt();

		for(int i = 0; i < game_num; i++){

			String tarou_card = in.next();
			String hanako_card = in.next();

			for(char a = 'a'; a <= 'z'; a++){

				if(tarou_card.charAt(0) == a && hanako_card.charAt(0) == a){

					tarou_point += 1;
					hanako_point += 1;

					break;

				}else if(tarou_card.charAt(0) == a){

					hanako_point += 3;

					break;

				}else if(hanako_card.charAt(0) == a){

					tarou_point += 3;

					break;

				}

			}

		}

		System.out.println(tarou_point + " " + hanako_point);

	}

}