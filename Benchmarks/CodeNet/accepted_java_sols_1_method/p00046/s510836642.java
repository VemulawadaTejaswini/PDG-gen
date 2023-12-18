import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		float high = 0.0f;
		float low = 999999.0f;

		while(stdIn.hasNext()){
			high = Math.max(stdIn.nextFloat(), high);
			low = Math.min(stdIn.nextFloat(), low);
		}
		float differenceHeight = high - low;
		System.out.println(differenceHeight);
	}
}