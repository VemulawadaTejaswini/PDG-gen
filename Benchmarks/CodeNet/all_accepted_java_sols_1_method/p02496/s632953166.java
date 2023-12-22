import java.util.Scanner;
//NOCs = Number of cards
//KOC  = Kinds of card
//ROC  = Rank of card

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		String NOCs_string = sc.nextLine();
		Integer NOCs = Integer.valueOf(NOCs_string);
		
		int[] Snum, Hnum, Cnum, Dnum;
		Snum = new int[13];Hnum = new int[13];Cnum = new int[13];Dnum = new int[13];
		
		for(;NOCs > 0;){
			char KOC = sc.next().charAt(0);
			int ROC = sc.nextInt();
			if(KOC == 'S') Snum[ROC - 1] = 1;
			if(KOC == 'H') Hnum[ROC - 1] = 1;
			if(KOC == 'C') Cnum[ROC - 1] = 1;
			if(KOC == 'D') Dnum[ROC - 1] = 1;
			NOCs--;
		} for(int i = 0;i < 13;i++){
			if(Snum[i] == 0) System.out.println("S " + (i + 1));
		} for(int i = 0;i < 13;i++){
			if(Hnum[i] == 0) System.out.println("H " + (i + 1));
		} for(int i = 0;i < 13;i++){
			if(Cnum[i] == 0) System.out.println("C " + (i + 1));
		} for(int i = 0;i < 13;i++){
			if(Dnum[i] == 0) System.out.println("D " + (i + 1));
		}
	}
}