import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class Main{


	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		char[] num = scanner.nextLine().toCharArray();

		String flag = "AC";

		//#1
		if(num[0] != 'A')flag = "WA";

		//#2
		int cnt  = 0;
		for(int i = 2; i < num.length - 1; i++) {

			if(num[i] == 'C') {

				cnt++;
			}else if(Character.isUpperCase(num[i])) {

				flag = "WA";
				break;
			}
		}

		if(Character.isUpperCase(num[1]) || cnt != 1)flag = "WA";
		if(Character.isUpperCase(num[num.length - 1]))flag = "WA";

		System.out.println(flag);



	}
}
