import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int charCount = sc.nextInt();
		String word = sc.next();
		int answer = 0;
		int index = 0;
		while(true) {
			index = word.indexOf("ABC");
			if(index == -1){
				break;
			}else {
				word = word.substring(index +3);
				answer++;
			}
		}
		System.out.println(answer);

	}
}