import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception {

		Scanner sc = new Scanner(System.in);
		String[] str = sc.nextLine().split(" ");
		int[] num = new int[str.length];
		int i = 0;

		for(int j = 0; j < str.length; j++) {

			String temp = str[j];

			if(temp.matches("[0-9]{1,}")) {
				num[i] = Integer.parseInt(temp);
				i++;
			} else {
				switch(temp) {
				case "+" :
					num[i-2] = num[i-2] + num[i-1];
					i--;
					break;
				case "-" :
					num[i-2] = num[i-2] - num[i-1];
					i--;
					break;
				case "*" :
					num[i-2] = num[i-2] * num[i-1];
					i--;
					break;

				}
			}
		}
		System.out.println(num[i-1]);
	}

}
