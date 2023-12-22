import java.io.*;

public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		Card[][] cardSet = new Card[4][14];
		for (int i = 0 ; i < cardSet.length; i++) {
			for (int j = 0; j < cardSet[i].length; j++) {
				cardSet[i][j] = new Card(i, j);
			}
		}
		
		int n = Integer.parseInt(br.readLine());
		String[] str = new String[2];
		int a, b = 0;
		for (int i = 0; i < n; i++) {
			str = br.readLine().split("\\s+");
			a = "S".equals(str[0]) ? 0 : "H".equals(str[0]) ? 1 : "C".equals(str[0]) ? 2 : "D".equals(str[0]) ? 3 : 4;
			b = Integer.parseInt(str[1]);
			cardSet[a][b].setIsOwn(true);;
		}

		for (Card[] cards : cardSet) {
			for (Card card : cards) {
				if (!card.getIsOwn() && card.getNumber() != 0) System.out.println(card.getSuitbyRom() + " " + card.getNumber());
			}
		}
	}
}

class Card {
	private String suitbyRom;
	private int number;
	private Boolean isOwn;
	
	public Card(int i, int j) {
		this.suitbyRom = 0 == i ? "S" : 1 == i ? "H" : 2 == i ? "C" : 3 == i ? "D" : "X";
		this.number = j;
		this.isOwn = false;
	}
	
	public String getSuitbyRom() {
		return this.suitbyRom;
	}
	
	public int getNumber() {
		return this.number;
	}
	
	public Boolean getIsOwn() {
		return this.isOwn;
	}
	
	public void setIsOwn(Boolean bool) {
		this.isOwn = bool;
	}
	
}