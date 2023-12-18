import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {

		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

		int counter = 0;
		ArrayList<Integer[]> alResult = new ArrayList<Integer[]>();

		while((counter = Integer.parseInt(bufferedReader.readLine())) != 0){
			int playerA = 0;
			int playerB = 0;

			for(int i = 0; i < counter; i++) {
				String[] arrCard = bufferedReader.readLine().split(" ");

				int playerACard = Integer.parseInt(arrCard[0]);
				int playerBCard = Integer.parseInt(arrCard[1]);

				if(playerACard < playerBCard) playerA += playerACard + playerBCard;
				else if(playerACard < playerBCard) playerA += playerACard + playerBCard;
				else{
					playerA += playerACard;
					playerB += playerBCard;
				}
			}

			Integer[] arrResult = new Integer[2];
			arrResult[0] = playerA;
			arrResult[1] = playerB;

			alResult.add(arrResult);
		}

		for(int i = 0; i < alResult.size(); i++) System.out.println(alResult.get(i)[0] + " " + alResult.get(i)[1]);
	}
}