import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Judge judge = new Judge('o', 'x');
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			System.out.println(judge.decideWinner(str));
		}
	}

}

class Judge {
	private char player1;
	private char player2;
	private char draw = 'd';
	
	public Judge(char p1, char p2){
		player1 = p1;
		player2 = p2;
	}
	
	public char decideWinner(String str){
		char[] players = {player1, player2};
		char winner = draw;
		char[] cArray = str.toCharArray();
		
		for(int i = 0; i < players.length ; i++){
			for(int j = 0; j < 3; j++){
				if(cArray[j*3]==players[i] && cArray[j*3 + 1]==players[i] && cArray[j*3 + 2]==players[i]){
					return players[i];
				}
			}
			
			for(int j = 0; j < 3; j++){
				if(cArray[j]==players[i] && cArray[j+3]==players[i] && cArray[j+6]==players[i]){
					return players[i];
				}
			}
			
			if(cArray[0]==players[i] && cArray[4]==players[i] && cArray[8]==players[i]){
				return players[i];
			}

			if(cArray[2]==players[i] && cArray[4]==players[i] && cArray[6]==players[i]){
				return players[i];
			}

		}
		
		return winner;
	}
}