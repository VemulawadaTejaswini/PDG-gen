import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		while(true){
			int[] hand = new int[6];
			for(int i=1;i<=5;i++){
				hand[i] = stdIn.nextInt();
				if(hand[i]==0){
					return;
				}
			}
			int[] comb = new int[4];
			for(int i=1;i<=5;i++){
				comb[hand[i]]++;
			}
			if(comb[1]>0&&comb[2]>0&&comb[3]>0){
				for(int i=1;i<=5;i++){
					System.out.println("3");
				}
			}
			else if(comb[1]==5||comb[2]==5||comb[3]==5){
				for(int i=1;i<=5;i++){
					System.out.println("3");
				}
			}
			else if(comb[1]==0){
				// 2 = win1 , 3 = lose2
				for(int i=1;i<=5;i++){
					if(hand[i]==2){
						System.out.println("1");
					}
					else{
						System.out.println("2");
					}
				}
			}
			else if(comb[2]==0){
				// 3 = win1 , 1 = lose2
				for(int i=1;i<=5;i++){
					if(hand[i]==3){
						System.out.println("1");
					}
					else{
						System.out.println("2");
					}
				}
			}
			else{
				for(int i=1;i<=5;i++){
					if(hand[i]==1){
						System.out.println("1");
					}
					else{
						System.out.println("2");
					}
				}
			}
		}
	}
}