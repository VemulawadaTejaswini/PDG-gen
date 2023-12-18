import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Dice {
	public int[] value;
	public Dice(String[] info, int size) {
		this.value = new int[size];
		for (int i = 0; i < size; i++) {
			this.value[i] = Integer.parseInt(info[i]);
		}
	}
}

public class Main {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Dice dice = new Dice(br.readLine().split(" "), 6);
		String[] commands = br.readLine().split("");

		for (int i = 0; i < commands.length; i++) {
 		/*for (String command : commands) {*/
			int work = dice.value[0];
			if (commands[i].equals("N")) {
				dice.value[0] = dice.value[1];
				dice.value[1] = dice.value[5];
				dice.value[5] = dice.value[4];
				dice.value[4] = work;
			} else if (commands[i].equals("E")) {
				dice.value[0] = dice.value[3];
				dice.value[3] = dice.value[5];
				dice.value[5] = dice.value[2];
				dice.value[2] = work;
			} else if (commands[i].equals("W")) {
				dice.value[0] = dice.value[2];
				dice.value[2] = dice.value[5];
				dice.value[5] = dice.value[3];
				dice.value[3] = work;
			} else {
				dice.value[0] = dice.value[4];
				dice.value[4] = dice.value[5];
				dice.value[5] = dice.value[1];
				dice.value[1] = work;
			}
		}
		System.out.println(dice.value[0]);
	}
}