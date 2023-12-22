import java.io.IOException;
import java.util.Scanner;

public class Main{
	public static void main(String[] args) throws NumberFormatException, IOException{
		int firstinput;
		int secondinput;
		int length;
		Scanner scan = new Scanner(System.in);
		while(scan.hasNext()){
			firstinput = scan.nextInt();
			secondinput = scan.nextInt();
			length = String.valueOf((firstinput + secondinput)).length();
			System.out.println(length);
		}

	}
}