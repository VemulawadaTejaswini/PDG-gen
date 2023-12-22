import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			
			int n = Integer.parseInt(tmpArray[0]);
			int winner = Integer.parseInt(tmpArray[1]);
			int rate = Integer.parseInt(tmpArray[2]);
			
			if(n == 0 && winner == 0 && rate == 0){
				break;
			}
			
			int[] tickets = new int[n];
			int sumOfTicket = 0;
			for(int i = 0; i < n; i++){
				tickets[i] = Integer.parseInt(br.readLine());
				sumOfTicket += tickets[i];
			}
			
			int gold = sumOfTicket * (100 - rate);
			
			if(tickets[winner - 1] == 0){
				System.out.println(0);
			}
			else {
				System.out.println(gold/tickets[winner-1]);
			}
		}
	}

}