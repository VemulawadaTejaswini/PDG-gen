import java.util.Scanner;

public class Main{

	public static void main(String[] args) {
		int len;
		String str = new String();
		Scanner scan = new Scanner(System.in);
		int min = 0;
		int temp;

		len = scan.nextInt();
		str = "E" + scan.next() + "W";

		for(int i = 1;i < len + 1;i++) {
			if(str.charAt(i) == 'E') {
				min++;
			}
		}

		temp = min;

		for(int i = 1;i < len + 1;i++) {
			if(str.charAt(i-1) == 'W') temp++;
			if(str.charAt(i) == 'E') temp--;

			if(temp < min) min = temp;
		}

		System.out.println(min);

		scan.close();

	}
}