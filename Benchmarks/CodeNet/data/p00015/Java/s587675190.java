import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		//?????°?¨????
		int numSet = sc.nextInt(); //???????????????????????°
		String num1;
		String num2;
		int advance = 0;
		int num;

		for(int count = 0; count < numSet; count++) { //???????????????????????°????????°?????????
			List<Integer> ans = new ArrayList<Integer>();

			num1 = sc.next();
			num2 = sc.next();

			String[] numbersStr1 = num1.split("");
			String[] numbersStr2 = num2.split("");

			numbersStr1 = reverse(numbersStr1);
			numbersStr2 = reverse(numbersStr2);

			int max = Math.max(numbersStr1.length, numbersStr2.length);


			for(int i = 0; i < max; i++) {
				if(numbersStr1.length - i > 0 && numbersStr2.length - i > 0) {
					num = Integer.parseInt(numbersStr1[i]) +  Integer.parseInt(numbersStr2[i]) + advance;
					advance = 0;

					if(num >= 10) { //?¶?????????????2????????¨???
						num -= 10;
						advance = 1;
					}

					//???????????\??????
					ans.add(i, num);

				} else if(numbersStr1.length - i > 0) {
					num = Integer.parseInt(numbersStr1[i]) + advance;
					advance = 0;

					if(num >= 10) { //?¶?????????????2????????¨???
						num -= 10;
						advance = 1;
					}

					//???????????\??????
					ans.add(i, num);

				} else if(numbersStr2.length - i > 0) {
					num = Integer.parseInt(numbersStr2[i]) + advance;

					advance = 0;

					if(num >= 10) { //?¶?????????????2????????¨???
						num -= 10;
						advance = 1;
					}

					//???????????\??????
					ans.add(i, num);
				}
			}

			if(advance > 0) {
				ans.add(1);
				advance = 0;
			}

			if(ans.size() > 80) {
				System.out.println("overflow");
			} else {
				for(int i = ans.size() - 1; i >= 0; i--) {
					System.out.print(ans.get(i));
				}
				System.out.println("");
			}
		}
	}

	public static String[] reverse(String[] array) {
		int len = array.length;
		String box;

		for(int i = 0; i < len / 2; i++) {
			box = array[i];
			array[i] = array[len - 1 - i];
			array[len - 1 - i] = box;
		}

		return array;
	}

}