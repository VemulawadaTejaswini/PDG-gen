import java.util.Scanner;

public class Main{
	public static void main(String[] args){

		Scanner scan = new Scanner(System.in);

		int number = scan.nextInt();

		int cards[][] = new int[4][13];

		int m;
		int n;

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				m = scan.nextInt();
				n = scan.nextInt();
				cards[m][n] = n;
			}
		}

		for(int i = 0; i < 4; i++){
			for(int j = 0; j < 13; j++){
				if(cards[i][j] == 0){
					if(i == 0){
						System.out.print('S' + " " + j);
					}else if(i == 1){
						System.out.print('H' + " " + j);
					}else if(i == 2){
						System.out.print('C' + " " + j);
					}else if(i == 3){
						System.out.print('D' + " " + j);
					}
				}
			}
		}
	}
}