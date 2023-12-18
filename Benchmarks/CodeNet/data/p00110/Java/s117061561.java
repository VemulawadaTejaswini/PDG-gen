import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		while(sc.hasNext()) {
			String[] str = sc.next().split("\\+");
			String[] str1 = str[1].split("=");
			boolean flag = true;

			for(int $ = 0; $ <= 9; $++) {
				String[] text = {str[0], str1[0], str1[1]};
				int[] numbers = new int[3];

				for(int i = 0; i < 3; i++) {
					for(int n = 0; n < text[i].length(); n++) {
						if(text[i].charAt(n) == 'X') {
							text[i] = text[i].substring(0, n) + $ + text[i].substring(n+1, text[i].length());
						}
					}
					numbers[i] = Integer.parseInt(text[i]);
				}

				if(numbers[2] == (numbers[0] + numbers[1])) {
					System.out.println($);
					flag = false;
					break;
				}
			}

			if(flag) {
				System.out.println("NA");
			}
		}

	}

}