
import java.util.Scanner;

public class Main {
	final String[] operationName = {"North" , "East" , "South" , "West" , "Right" , "Left"};
	final static int[][] operation = {{3,2,0,1,4,5},{4,5,2,3,1,0},{2,3,1,0,4,5},{5,4,2,3,0,1},{0,1,5,4,2,3},{0,1,4,5,3,2}};
	public int[] dice = null;
	public int sum = 1;
	final int[] fDice = {1 , 6 , 2 , 5 , 3 , 4};//上、下、南、北、東、西
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		Main main = new Main();
		int n = scan.nextInt();
		while(n != 0) {
			for(int i = 0 ; i < n ; i++) {
				main.moveTheDice(scan.next());
			}
			main.print();

			main = new Main();
			n = scan.nextInt();
		}

	}
	Main() {
		dice = fDice;
		sum = 1;
	}
	public void moveTheDice(String doOperation) {
		for(int i = 0 ; i < operationName.length ; i++) {
			if(operationName[i].equals(doOperation)) {
				int newDice[] = new int[6];
				for(int j = 0 ; j < 6 ; j++) {
					newDice[operation[i][j]] = dice[j];
				}
				dice = newDice;
				break;
			}
		}
		sum = sum + dice[0];
	}
	public void print() {
		System.out.println(sum);
	}
}

