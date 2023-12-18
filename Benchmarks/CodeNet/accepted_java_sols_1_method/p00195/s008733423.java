import java.util.ArrayList;
import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		String[] k = new String[]{"A","B","C","D","E"};
		while(true) {
			int number = 0;
			int max = 0;
			for(int i = 0; i < 5; i++) {
				int tmp = stdIn.nextInt();
				tmp += stdIn.nextInt();
				if(tmp == 0) {
					return;
				}
				
				if(tmp > max) {
					max = tmp;
					number = i;
				}
			}
			
			System.out.println(k[number] + " " + max);
		}
	}
}