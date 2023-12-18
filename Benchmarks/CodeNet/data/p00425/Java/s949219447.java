import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Main m = new Main();
		m.run();
	}
	
	private void run(){
		Scanner scan = new Scanner(System.in);
		int n = scan.nextInt();
		while(n != 0){
			//サイコロの面を記録する
			//0：上、1：北、2：東、3：南、4：西、5：下
			int[] dice = {1, 5, 3, 2, 4, 6};
			int total = 1;
			String command;
			for (int i = 0; i < n; i++) {
				command = scan.next();
				if (command.equals("North")) {
					this.north(dice);
				}else if (command.equals("East")) {
					this.east(dice);
				}else if (command.equals("West")) {
					this.west(dice);
				}else if (command.equals("South")) {
					this.south(dice);
				}else if (command.equals("Right")) {
					this.right(dice);
				}else if (command.equals("Left")) {
					this.left(dice);
				}
				total += dice[0];
			}
			System.out.println(total);
			n = scan.nextInt();
		}
		
	}
	
	public void north(int[] dice){
		int temp = dice[0];
		dice[0] = dice[3];
		dice[3] = dice[5];
		dice[5] = dice[1];
		dice[1] = temp;
	}
	
	public void east(int[] dice){
		int temp = dice[0];
		dice[0] = dice[4];
		dice[4] = dice[5];
		dice[5] = dice[2];
		dice[2] = temp;
	}
	
	public void west(int[] dice){
		int temp = dice[0];
		dice[0] = dice[2];
		dice[2] = dice[5];
		dice[5] = dice[4];
		dice[4] = temp;
	}
	
	public void south(int[] dice){
		int temp = dice[0];
		dice[0] = dice[1];
		dice[1] = dice[5];
		dice[5] = dice[3];
		dice[3] = temp;
	}
	
	public void right(int[] dice){
		int temp = dice[3];
		dice[3] = dice[2];
		dice[2] = dice[1];
		dice[1] = dice[4];
		dice[4] = temp;
	}
	
	public void left(int[] dice){
		int temp = dice[3];
		dice[3] = dice[4];
		dice[4] = dice[1];
		dice[1] = dice[2];
		dice[2] = temp;
	}

}