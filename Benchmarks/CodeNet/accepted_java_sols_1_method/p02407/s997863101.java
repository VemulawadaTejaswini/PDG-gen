import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int x = stdIn.nextInt();
		int y[] = new int[x];
		for(int i=0; i < x; i++){
			y[i] = stdIn.nextInt();
		}
		stdIn.close();
		for(int i=x-1; i >= 0; i--){
			if(i != 0) {
				System.out.print(y[i] + " ");
			} else {
				System.out.println(y[i]);
			}
		}

	}
}

