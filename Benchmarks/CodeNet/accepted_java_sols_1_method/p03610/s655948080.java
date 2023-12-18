import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String s[] = sc.next().split("");

		for(int i = 1; i <= s.length; i++) {
			if(i % 2 == 1) {
				System.out.print(s[i-1]);
			}
		}


		/*
		String data = "";

		for(int i = 1; i <= s.length(); i++) {
			if(i % 2 == 1) {
				data = data + s.substring(i-1, i);
			}
		}

		System.out.println(data);
		*/

	}

}