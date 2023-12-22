import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		int turnNum = 0;
		int player1Score = 0;
		int player2Score = 0;

		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));

		turnNum = Integer.parseInt(br.readLine());

		for (int i = 0; i < turnNum; i++){

			String[] playerAnimal = (br.readLine()).split(" ");

			int compareResult = playerAnimal[0].compareTo(playerAnimal[1]);

			if (compareResult > 0){
				player1Score += 3;
			} else if (compareResult < 0){
				player2Score += 3;
			} else if (compareResult == 0){
				player1Score += 1;
				player2Score += 1;
			}
		}
		System.out.println(player1Score + " " + player2Score);
	}
}