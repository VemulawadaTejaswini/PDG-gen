import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int tarou_point = 0,hanako_point = 0;

		Scanner in = new Scanner(System.in);

		int game_num =in.nextInt();

		for(int i = 0; i < game_num; i++){

			String tarou_card = in.next();
			String hanako_card = in.next();

			// System.out.println(tarou_card.compareToIgnoreCase(hanako_card));
			if(tarou_card.compareToIgnoreCase(hanako_card) == 0){

				tarou_point += 1;
				hanako_point += 1;

			}else if(tarou_card.compareToIgnoreCase(hanako_card) > 0){

				tarou_point += 3;

			}else if(tarou_card.compareToIgnoreCase(hanako_card) < 0){

				hanako_point += 3;

			}

		}

		System.out.println(tarou_point + " " + hanako_point);

	}
}