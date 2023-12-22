import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scanner = new Scanner(System.in);
		
		String inputS = scanner.nextLine();

		scanner.close();
		
		String[] split = inputS.split(" ");
		Integer inA = Integer.parseInt(split[0]);
		Integer inB = Integer.parseInt(split[1]);
		Integer inC = Integer.parseInt(split[2]);
		
		int result = 0;
		for(int c = 0; c < 20; c++) {
			int time = c + 1;
			
			if(time > inC) {
				break;
			}

			if(time % inA == 0) {
				result += inB;
			}
			
			
		}
		System.out.println(result);
	}
}