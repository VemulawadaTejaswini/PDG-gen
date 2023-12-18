import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
	
	public static double game(int own, int ene, int own_score, int ene_score, ArrayList<Integer> own_hand, ArrayList<Integer> ene_hand, double dp[][][]){
		if(own == 0 && ene == 0){
			//System.out.println(own_score + " " + ene_score);
			return own_score > ene_score ? 1 : 0;
		}
		
		
		double prob = 0;
		
		for(int i = 0; i < 9; i++){
			if((own & (1 << i)) == 0){
				continue;
			}
			
			int i_count = 0;
			double i_prob = 0;
			
			for(int j = 0; j < 9; j++){
				if((ene & (1 << j)) == 0){
					continue;
				}
				
				boolean win = own_hand.get(i) > ene_hand.get(j);
				int all = own_hand.get(i) + ene_hand.get(j);
				
				i_prob += game(own & (~(1 << i)), ene & (~(1 << j)), win ? own_score + all : own_score, !win ? ene_score + all : ene_score, own_hand, ene_hand, dp);
				i_count++;
			}
			
			prob += i_prob / i_count;
			break;
		}
		
		return prob;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		final int n = sc.nextInt();
		
		for(int i = 0; i < n; i++){
			ArrayList<Integer> own = new ArrayList<Integer>(9);
			ArrayList<Integer> ene = new ArrayList<Integer>(9);
			
			for(int j = 0; j < 9; j++){
				own.add(sc.nextInt());
			}
			
			for(int j = 0; j < 9; j++){
				ene.add(sc.nextInt());
			}
			
			double[][][] dp = new double[1 << 9][1 << 9][2];
			for(int j = 0; j < (1 << 9); j++){
				for(int k = 0; k < (1 << 9); k++){
					for(int l = 0; l < 2; l++){
						dp[j][k][l] = -1.0;
					}
				}
			}
			
			double prob = game((1 << 9) - 1 , (1 << 9) - 1, 0, 0, own, ene, dp);
			
			System.out.println(prob + " " + (1 - prob));
		}
	}

}