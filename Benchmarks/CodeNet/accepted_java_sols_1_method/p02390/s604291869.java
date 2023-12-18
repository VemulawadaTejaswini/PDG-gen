import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner scanner = new Scanner(System.in);
		int input= scanner.nextInt();
		int hour=input/(60*60);
		int minute= (input%(60*60))/60;
		int second= (input%(60*60))%60;
		System.out.println(Integer.toString(hour)+":"+Integer.toString(minute)+":"+Integer.toString(second));
		scanner.close();
	}
}