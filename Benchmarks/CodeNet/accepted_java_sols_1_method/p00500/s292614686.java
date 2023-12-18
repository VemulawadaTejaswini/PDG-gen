import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int card [][] = new int[N][3];
		int score [] = new int[N];
		int count [][] = new int[N][3];
		for(int i = 0 ; i < N ; i++){
			card[i][0] = sc.nextInt();
			card[i][1] = sc.nextInt();
			card[i][2] = sc.nextInt();
		}
		
		
		for(int i = 0 ; i < N ; i++){
			for(int k = 0 ; k < 3 ; k++){
				for(int j = 0 ; j < N ; j++){
					if(card[i][k] != card[j][k]){
						count[i][k]++;
					}
				}
				if(count[i][k] == N - 1){
					score[i] = score[i] + card[i][k];
				}
			}
			
		}
	
			
			
		for(int i = 0 ; i < N ; i++){
			System.out.println(score[i]);
		}
        }
}