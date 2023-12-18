import java.util.*;
public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		String[] suit = {"S","H","C","D"};
		String[] rank = {"1","2","3","4","5","6","7","8","9","10","11","12","13"};
		int n = sc.nextInt();
		boolean[][] card = new boolean[suit.length][rank.length];
		for (int i = 0; i < n; i ++ ){
			String s = sc.next();
			String r = sc.next();
			int sIdx = Arrays.asList(suit).indexOf(s);
			int rIdx = Arrays.asList(rank).indexOf(r);
			card[sIdx][rIdx] = true;
		}
		for (int i = 0; i < suit.length; i ++ ){
			for (int k = 0; k < rank.length; k ++ ){
				if (!card[i][k]){
					System.out.println(suit[i] + " " + rank[k]);
				}
			}
		}
		sc.close();
	}
}