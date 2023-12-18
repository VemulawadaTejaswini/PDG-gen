import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		scanner.useDelimiter("[\\n,]");
		
		int input1, input2, ansSita = 0;
		double ansX = 0, ansY = 0;
		while(true){
			input1 = scanner.nextInt();
			input2 = scanner.nextInt();
			if(input1 == 0 && input2 == 0){
				break;
			}
			ansX = ansX + ((double)input1*Math.sin((ansSita*Math.PI)/180));
			ansY = ansY + ((double)input1*Math.cos((ansSita*Math.PI)/180));
			ansSita = (ansSita + input2);
		}
		System.out.println((int)ansX);
		System.out.println((int)ansY);
	}
}