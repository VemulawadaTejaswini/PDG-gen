package _6.findingMissingCards;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		Set<Card> exists = new HashSet<Card>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] tmp;
		String suite;
		int rank;
		for(int i = 0;i < n;i++){
			tmp = br.readLine().split(" ");
			suite = tmp[0];
			rank = Integer.parseInt(tmp[1]);
			exists.add(new Card(suite, rank));
		}
		
		String[] suiteTable = {"S", "H", "C", "D"};
		for(int i = 0;i < suiteTable.length;i++){
			for(int j = 1;j <= 13;j++){
				if(!exists.contains(new Card(suiteTable[i], j))){
					StringBuilder sb = new StringBuilder();
					sb.append(suiteTable[i]);
					sb.append(" ");
					sb.append(j);
					System.out.println(sb.toString());
					sb = null;
				}
			}
		}
	}

}

class Card {
	private String suite;
	private int rank;
	
	Card(String suite, int rank){
		this.suite = suite;
		this.rank = rank;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Card other = (Card) obj;
		if (rank != other.rank)
			return false;
		if (suite == null) {
			if (other.suite != null)
				return false;
		} else if (!suite.equals(other.suite))
			return false;
		return true;
	}

}