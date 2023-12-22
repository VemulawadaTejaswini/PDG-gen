import java.util.Scanner;

class Main {
    public static void main(String[] args) {
	Scanner stdIn = new Scanner(System.in);

	int a = stdIn.nextInt();
	int b = stdIn.nextInt();
	int c = stdIn.nextInt();
	int d = stdIn.nextInt();


	int deatht = (a % d == 0) ? a/d : a/d+1;
	int deatha = (c % b == 0) ? c/b : c/b+1;

	System.out.println((deatht < deatha) ? "No" : "Yes");
    }
}