import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		while(true){
			String line = br.readLine();

	        int n = Integer.parseInt(line);

	        if(n == 0) break;

	        Dice dice = new Dice();

	        for(int i = 0; i < n; i++){
	        	dice.move(br.readLine());

	        }

	        System.out.println(dice.getSum());

		}
	}

}

class Dice {
	//??????????????????????\\??????????????????
	private int[] numbers = {1,2,3,5,4,6};
	private int sum = 1;

	public void move (String command){
		if(command.equals("North")) {
			north();
		}

		else if(command.equals("South")) {
			south();
		}
		else if(command.equals("East")) {
			east();
		}
		else if(command.equals("West")) {
			west();
		}
		else if(command.equals("Right")) {
			right();
		}
		else if(command.equals("Left")) {
			left();
		}

		sum += numbers[0];
	}

	public int getSum(){
		return sum;
	}

	private void north () {
		int[] tmp = numbers.clone();
		numbers[0] = tmp[1];
		numbers[1] = tmp[5];
		numbers[3] = tmp[0];
		numbers[5] = tmp[3];
	}

	private void east () {
		int[] tmp = numbers.clone();
		numbers[0] = tmp[4];
		numbers[2] = tmp[0];
		numbers[4] = tmp[5];
		numbers[5] = tmp[2];
	}

	private void west () {
		east(); east(); east();
	}

	private void south () {
		north(); north(); north();
	}

	private void right () {
		int[] tmp = numbers.clone();
		numbers[1] = tmp[2];
		numbers[2] = tmp[3];
		numbers[3] = tmp[4];
		numbers[4] = tmp[1];
	}

	private void left () {
		right(); right(); right();
	}
}