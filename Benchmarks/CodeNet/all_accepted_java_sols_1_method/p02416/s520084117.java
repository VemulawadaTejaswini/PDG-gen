import java.util.Scanner;

//20180510
//04

public class Main {
    public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		while (scanner.hasNext()) {
			String str = scanner.nextLine();
			char[] cha = str.toCharArray();
			int sum = 0;

			if(str.equals("0")) {
				break;
			}

			for(int i = 0;i < cha.length;i++) {

				sum += Character.getNumericValue(cha[i]);
			}

			System.out.println(sum);
		}

		scanner.close();
    }
}
