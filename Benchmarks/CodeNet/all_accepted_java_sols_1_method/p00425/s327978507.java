import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);

		while(true){
			int n = stdIn.nextInt();
			if(n==0){
				return;
			}
			
			int sum = 1;
			int[] dice = {1,3,6,4,2,5};
			for(int i=0;i<n;i++){
				String cmd = stdIn.next();
				if(cmd.compareTo("North")==0){
					int tmp = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[2];
					dice[2] = dice[5];
					dice[5] = tmp;
				}
				else if(cmd.compareTo("East")==0){
					int tmp = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[2];
					dice[2] = dice[1];
					dice[1] = tmp;
				}
				else if(cmd.compareTo("West")==0){
					int tmp = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[2];
					dice[2] = dice[3];
					dice[3] = tmp;
				}
				else if(cmd.compareTo("South")==0){
					int tmp = dice[0];
					dice[0] = dice[5];
					dice[5] = dice[2];
					dice[2] = dice[4];
					dice[4] = tmp;
				}
				else if(cmd.compareTo("Right")==0){
					int tmp = dice[4];
					dice[4] = dice[1];
					dice[1] = dice[5];
					dice[5] = dice[3];
					dice[3] = tmp;
				}
				else if(cmd.compareTo("Left")==0){
					int tmp = dice[4];
					dice[4] = dice[3];
					dice[3] = dice[5];
					dice[5] = dice[1];
					dice[1] = tmp;
				}
				sum+=dice[0];
			}
			System.out.println(sum);
		}
	}
}