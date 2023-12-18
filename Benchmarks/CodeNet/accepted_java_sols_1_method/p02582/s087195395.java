import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String str = sc.next();

		int count = 0;

		for(int i = 0; i < 3; i++) {


				if(count > 0) {
					if(str.charAt(i) == 'R') {
						if(str.charAt(i-1) == 'R') {
							count++;
						}
					}



			} else {
				if(str.charAt(i) == 'R') {
					count++;
				}
			}

		}
		System.out.println(count);

	}

}