import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		int input;
		long ans = 0;
		Scanner scanner = new Scanner(System.in);
		while(scanner.hasNext()){
			input = scanner.nextInt();
			for(int i=0; i<((600/input)-1); i++){
				ans = (ans + (long)(input * (Math.pow((input*(i+1)), 2))));
			}
			System.out.println(ans);
			ans=0;
		}
	}
}