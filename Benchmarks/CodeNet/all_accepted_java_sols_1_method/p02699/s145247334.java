import java.util.Scanner;

class Main {

    public static void main(String[] args) {

	Scanner stdIn = new Scanner(System.in);

	int s = stdIn.nextInt();
	int w = stdIn.nextInt();

	System.out.println((s > w) ? "safe" : "unsafe");

    }
}