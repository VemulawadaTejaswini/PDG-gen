import java.util.Scanner;

class Main {

    public static void main(String[] args) {

	final Scanner stdin = new Scanner(System.in);
	final int n = Integer.parseInt(stdin.nextLine());
	for (int i = 0; i < n; i++) {
	    System.out.println(stdin.nextLine().replace("Hoshino", "Hoshina"));
	}		
    }
}