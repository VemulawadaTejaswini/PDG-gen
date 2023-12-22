import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		String s = sc.next();
		List<String> strList = new ArrayList<String>(Arrays.asList(s.split("")));
		List<String> answerList = new ArrayList<String>();

		for (String str : strList) {
			if (answerList.size() != 0 && !answerList.get(answerList.size() - 1).equals(str)) {
				answerList.add(str);
			} else if (answerList.size() == 0) {
				answerList.add(str);
			}
		}

		System.out.println(answerList.size());
	}
}
