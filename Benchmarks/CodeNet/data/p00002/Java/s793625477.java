import java.io.IOException;
import java.util.Scanner;

public class main {
	public static void main(String[] args) throws NumberFormatException, IOException{
		int firstinput;
		int secondinput;
		int length;
		for(int i=0; i<200; i++){
			Scanner scan = new Scanner(System.in);
			firstinput = scan.nextInt();
			secondinput = scan.nextInt();
			length = String.valueOf((firstinput + secondinput)).length();
			System.out.println(length);
		}
	}
}