import java.util.Scanner;
public class Main{
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		Integer[] dice = {1,3,4,2,5,6};//{上(0)、東(1)、西(2)、南(3)、北(4)、下(5)}

		while(true){
			int diceCount = stdIn.nextInt();
			if(diceCount == 0)break;
			int diceSum = 1;
			for(int i=0;i<diceCount;i++){
				String diceMethod = stdIn.next();
				if("North".equals(diceMethod)){
					int northCopy = dice[4];
					dice[4] = dice[0];
					dice[0] = dice[3];
					dice[3] = dice[5];
					dice[5] = northCopy;
				}else if("East".equals(diceMethod)){
					int eastCopy = dice[1];
					dice[1] = dice[0];
					dice[0] = dice[2];
					dice[2] = dice[5];
					dice[5] = eastCopy;
				}else if("West".equals(diceMethod)){
					int westCopy = dice[2];
					dice[2] = dice[0];
					dice[0] = dice[1];
					dice[1] = dice[5];
					dice[5] = westCopy;
				}else if("South".equals(diceMethod)){
					int southCopy = dice[3];
					dice[3] = dice[0];
					dice[0] = dice[4];
					dice[4] = dice[5];
					dice[5] = southCopy;
				}else if("Right".equals(diceMethod)){
					int rightCopy =dice[1];
					dice[1] = dice[4];
					dice[4] = dice[2];
					dice[2] = dice[3];
					dice[3] = rightCopy;
				}else if("Left".equals(diceMethod)){
					int leftCopy = dice[2];
					dice[2] = dice[4];
					dice[4] = dice[1];
					dice[1] = dice[3];
					dice[3] = leftCopy;
				}
				diceSum += dice[0];
			}
			System.out.println(diceSum);
		}
	}
}