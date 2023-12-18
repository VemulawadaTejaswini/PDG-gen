import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int i,j = 1;
		while ((i =stdIn.nextInt()) != 0) {
		      System.out.println("Case " + j + ":" + " " + i);
		      j++;
		}
        stdIn.close();
	}
}

