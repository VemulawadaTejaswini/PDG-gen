import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

	Scanner sca = new Scanner(System.in);
	int a = sca.nextInt();
	int b = sca.nextInt();
	int answer;
	if(a > b) {
		if(a == 3 && b == 2) {
			answer = 1;
		}
		else if(a == 3 && b == 1) {
			answer = 2;
		}
		else {
			answer = 3;
		}
	}
	else {
		if(b == 3 && a == 2) {
			answer = 1;
		}
		else if(b == 3 && a == 1) {
			answer = 2;
		}
		else {
			answer = 3;
		}
	}

	System.out.println(answer);

	sca.close();
	}
}