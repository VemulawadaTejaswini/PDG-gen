import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner kbScanner = new Scanner(System.in);
		int input1 = kbScanner.nextInt();
		int input2 = kbScanner.nextInt();
		
		while((input1 != 0) || (input2 != 0)){
			if(input1 > input2){
				int oki = input1;
				input1 = input2;
				input2 = oki;
			}
			System.out.println(input1 + " " + input2);
			input1 = kbScanner.nextInt();
			input2 = kbScanner.nextInt();
		}
	}
}