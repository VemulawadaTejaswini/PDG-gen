import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String num = br.readLine();

		String[] words ;

		int player1_score =0;

		int player2_score =0;

		for(int i=0; i<Integer.parseInt(num); i++){

			words = br.readLine().split(" ");
			if((words[0].compareTo(words[1])) < 0){

				player2_score += 3;
			}else if ((words[0].compareTo(words[1])) > 0) {
				player1_score +=3;
			}else {
				player1_score +=1;
				player2_score +=1;
			}
		}

		System.out.println(player1_score+" "+player2_score);


	}

}