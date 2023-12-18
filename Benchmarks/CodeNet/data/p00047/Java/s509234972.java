import java.util.Scanner;

public class Main{
	
	public static void main(String[] args){

		Scanner sc = new Scanner(System.in);
		char ball = 'A';
		while(sc.hasNextLine()) {
			String str = sc.nextLine();
			ball = whereIsBall(ball, str.charAt(0), str.charAt(2));
		}
		sc.close();
		System.out.println(ball);
	}
	
	static char whereIsBall(char ball, char swap1, char swap2) {
		if(ball == swap1) return swap2;
		else if(ball == swap2) return swap1;
		else return ball;
	}
}