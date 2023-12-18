import java.util.*;
public class Main {
	HashMap<Character, Integer> change;
	
	//0308 start
	//0352 cording end
	//0353 WA
	private void doit(){
		Scanner sc = new Scanner(System.in);
		initchangeNum();
		while(true){
			String trump = sc.next();
			if(trump.equals("#")){
				break;
			}
			int n = 4;
			String [][] deck = new String[n][13];
			for(int i = 0; i < 4; i++){
				for(int j = 0; j < 13; j++){
					deck[i][j] = sc.next();
				}
			}
			
			int nspoint = 0, ewpoint = 0, leaderInd = 0;
			for(int i = 0; i < 13;i++){
				int nextind = leaderInd;
				String nextString = deck[leaderInd][i];
				char nextmark = nextString.charAt(1);
				int nextpower = change.get(nextString.charAt(0));
				for(int j = leaderInd + 1; j < leaderInd + 4; j++){
					int jind = j % 4;
					String now = deck[jind][i];
					int nowpower= change.get(now.charAt(0));
					char nowmark = now.charAt(1);
					if(nextmark == nowmark){
						if(nextpower < nowpower){
							nextind = jind;
							nextString = deck[jind][i];
							nextmark = nowmark;
							nextpower = nowpower;
						}
					}
					else{
						//mark
						if(trump.charAt(0) == nowmark){
							nextind = jind;
							nextString = deck[jind][i];
							nextmark = nowmark;
							nextpower = nowpower;
						}
					}
				}
				if(nextind % 2 == 0){
					nspoint++;
				}
				else{
					ewpoint++;
				}
				leaderInd = nextind;
			}
			if(nspoint > ewpoint){
				System.out.println("NS " + (nspoint - 6));
			}
			else{
				System.out.println("EW " + (ewpoint - 6));
			}
		}
	}
	private void initchangeNum() {
		change = new HashMap<Character, Integer>();
		for(int i = 0; i < 10; i++){
			change.put((char)('0' + i), i);
		}
		change.put('T', 10);
		change.put('J', 11);
		change.put('Q', 12);
		change.put('K', 13);
		change.put('A', 14);
	}

	public static void main(String[] args) {
		Main obj = new Main();
		obj.doit();
	}
}