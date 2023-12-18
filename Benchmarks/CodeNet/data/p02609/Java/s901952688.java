import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String input1 = sc.nextLine();
		String input2 = sc.nextLine();
		StringBuilder str = new StringBuilder(input2);


		for (int i = 0; i < str.length(); i++) {
			// ビット反転
			str = changeNumber(new StringBuilder(input2), i);

			// 1の数カウント
			int count = countOne(str);

			// ２進数->１０進数
			String str2 = new String(str);
			int numTen = Integer.parseInt(str2, 2);

			int count2 = 0;

			while(numTen != 0) {
				numTen = numTen % count; // decは１０進数int
				count2++;

				//10 -> 2
				String numTwo = Integer.toBinaryString(numTen);

				//String -> Bulider
				count = countOne(new StringBuilder(numTwo));
				numTen = Integer.parseInt(numTwo, 2);

			}

			System.out.println(count2);


		}

	}

	static StringBuilder changeNumber(StringBuilder str, int start) {
		if(str.substring(start, start+1).equals("0")) {
			str.setCharAt(start, '1');
		}else {
			str.setCharAt(start, '0');
		}

		return str;

	}

	static int countOne(StringBuilder str) {
		int count = 0;
		for(int j = 0; j < str.length(); j++) {

			if(str.substring(j, j+1).equals("1")){
				count++;
			}
		}
		return count;
	}



}
