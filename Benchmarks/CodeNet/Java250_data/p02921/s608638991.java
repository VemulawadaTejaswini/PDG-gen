/*天気*/
import java.util.Scanner;

public class Main{
	public static void main(String[] args) {

		int i;
		int count = 0;

		Scanner sc = new Scanner(System.in);

		String S = sc.nextLine();
		String T = sc.nextLine();

		String[] SArray = S.split("");
		String[] TArray = T.split("");


		for(i = 0; i < 3;i++) {
			if(SArray[i].equals(TArray[i])) count++;
		}
	      System.out.println(count);
	}
}