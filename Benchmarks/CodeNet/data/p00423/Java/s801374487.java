import java.util.*;

class Main {
	static int[] cardA, cardB;
	static int n;

	public static void main (String [] args){
		play();	
	}
	
	static void init(){
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		cardA = new int[n];
		cardB = new int[n];

		for(int i=0; i<n; i++){
			cardA[i] = sc.nextInt();
			cardB[i] = sc.nextInt();
		}
	}

	static void play(){
		for(;;){
			init();
			if(n == 0) System.exit(1);

			int scoreA = 0, scoreB = 0;
			for(int i=0; i<n; i++){
				if(cardA[i] > cardB[i]) scoreA += cardA[i]+cardB[i];
				else if(cardA[i] == cardB[i]){
					scoreA += cardA[i];
					scoreB += cardB[i];
				}
				else scoreB += cardA[i]+cardB[i];
			}
			
			System.out.println(scoreA+" "+scoreB);		
		}
	}	
}