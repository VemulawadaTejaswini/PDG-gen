import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//???????????¨???????????¨??????
public class Main {
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {
		int dataSet = sc.nextInt(); //??????????????°
		String text = null;

		for(int $ = 0; $ < dataSet; $++) {
			text = sc.next();
			boolean flag = false;
			List<Character> dataList = new ArrayList<Character>();
			char[] word = text.toCharArray();
			char alpha = ' ';
			int n = 0;
			int alphaNum = 0;
			for(int i = 0; i < word.length; i++) {
				if((i % 3) == 0) {
					if(flag) {
						if((n = dataList.indexOf(word[i])) < 0) {
							alphaNum = dataList.indexOf(alpha);
							dataList.add(alphaNum, word[i]);
						}
						alpha = word[i];
					} else {
						if((n = dataList.indexOf(word[i])) < 0 && (alpha == ' ')) {
							dataList.add(word[i]);
						} else if(n < 0) {
							alphaNum = dataList.indexOf(alpha);
							dataList.add(alphaNum + 1, word[i]);
						}
						alpha = word[i];
					}
				} else if(i % 3 == 2) {
					continue;
				} else {
					if(word[i] == '<') {
						flag = true;
					} else {
						flag = false;
					}
				}
			}
			for(int i = 0; i < dataList.size(); i++) {
				System.out.print(dataList.get(i));
			}
			System.out.println();
		}
	}

}