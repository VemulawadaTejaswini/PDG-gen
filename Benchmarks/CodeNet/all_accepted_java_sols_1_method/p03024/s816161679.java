import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String data = sc.next();
		int count = 0;
		char charX = 'x';

		for(char x: data.toCharArray()){
			if(x == charX){
				count++;
			}
		}

		if (count >= 8) {
			System.out.println("NO");
		} else {
			System.out.println("YES");
		}
	}


}
