import java.util.Scanner;

public class Main{
	public static void main(String args[]){

		Scanner sc = new Scanner(System.in);
		int intTime = sc.nextInt();
		int intH = 0;
		int intM = 0;
		int intS = 0;

		intH = intTime / (60 * 60);
		intM = (intTime - 3600 * intH ) / 60;
		intS = (intTime - 3600 * intH ) - (intM * 60);

		System.out.println(intH + ":" + intM + ":" + intS);
	}
}