import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class mountain{

	public static void main(String args[]){
		try{
			while(true){
				// まずカードの枚数を入力
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				int cardnum = Integer.parseInt(br.readLine());
				if(cardnum == 0) break; // 0が入力されたら修了
				int scoreA = 0, scoreB = 0;
				for(int i = 0; i < cardnum; i++){
					// スペースで文字を区切る
					String read_str = br.readLine();
					String[] cards_str = read_str.split(" ");
					//System.out.println(cards_str[0]);
					//System.out.println(cards_str[1]);
					int cardA = Integer.parseInt(cards_str[0]);
					int cardB = Integer.parseInt(cards_str[1]);
					if(cardA > cardB){
						scoreA += (cardA + cardB);
					}else if(cardA < cardB){
						scoreB += (cardA + cardB);
					}else{
						scoreA += cardA;
						scoreB += cardB;
					}
				}
				System.out.println(scoreA + " " + scoreB);
			}
		}catch(Exception e){
			System.err.println(e);
		}
	}
}