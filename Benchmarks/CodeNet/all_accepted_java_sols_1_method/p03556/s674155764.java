import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int num = s.nextInt();
		int guess = 1;
		while(num-guess*guess>=0){
			guess++;
		}
		System.out.println((guess-1)*(guess-1));
	}

}
