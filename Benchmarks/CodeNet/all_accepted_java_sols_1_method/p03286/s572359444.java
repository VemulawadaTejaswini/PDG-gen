
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int N = scanner.nextInt();
		int counter = 0;
		String output = "";
		
		if(N==0) {
			output = "0";
		}
		
		while(N!=0) {
			if((N-1)%(-2)==0) {
				output = "1" + output;
				N = (N-1)/(-2);
			} else {
				output = "0" + output;
				N = N/(-2);
			}
		}
		
		System.out.println(output);
		
		
	}

}