import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String[] tmpArray = br.readLine().split(" ");
			int numOfMayor = Integer.parseInt(tmpArray[0]);
			int numOfStone = Integer.parseInt(tmpArray[1]);
			
			if(numOfMayor == 0 && numOfStone == 0){
				break;
			}
			
			int bowlPos = 1;
			int[] stone = new int[numOfMayor];
			stone[0] = 1;
			int stoneInBowl = numOfStone - 1;
			
			int i = 0;
			while(true){
//				System.out.println("current position "+bowlPos + " turn "+i);
				if(stoneInBowl > 0){
					stone[bowlPos]++;
					stoneInBowl--;
					if(stone[bowlPos] == numOfStone){
						System.out.println(bowlPos);
						break;
					}
				}
				else if(stone[bowlPos] > 0){
					stoneInBowl += stone[bowlPos];
					stone[bowlPos] = 0;
				}
				bowlPos++;
				bowlPos %= numOfMayor;
				i++;
			}
		}
	}

}