import java.util.Scanner;
public class Main {
	
	int toDigit(String str) {
		int digit = 0;
		int inc = 0;
		for(int r = str.length() - 1; r >= 0; r--) {
			digit += (int)((str.charAt(r) - '0') * Math.pow(10,  (inc++)));
		}
		return(digit);
	}
	
	int hit(String reply, String answer) {
		int count = 0;
		for(int r = 0; r < reply.length(); r++) {
			if(reply.charAt(r) == answer.charAt(r)) count++;
		}
		return(count);
	}
	
	int blow(String reply, String answer) {
		int count = 0;
		for(int r = 0; r < reply.length(); r++) {
			for(int c = 0; c < answer.length(); c++) {
				if(r == c) continue;
				else if(reply.charAt(r) == answer.charAt(c)) count++;
			}
		}
		return(count);
	}
	
	void doIt() {
		Scanner stdIn = new Scanner(System.in);
		String reply, answer;
		while(true) {
			reply = stdIn.next();
			answer = stdIn.next();
			if(toDigit(reply) + toDigit(answer) == 0) break;
			System.out.println(hit(reply, answer) + " " + blow(reply, answer));
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main().doIt();
	}
}