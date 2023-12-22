import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] array = new String[n];
		for(int i= 0; i < n;i++) {
			array[i] = sc.next();
		}
		Arrays.sort(array);
		List<String> answerList = new ArrayList<String>();
		int count = 1;
		int maxCount = 1;
		for(int i = 1;i < n;i++) {
			if(array[i-1].equals(array[i])) {
				count++;
			}else {
				if(count> maxCount) {
					answerList.clear();
					answerList.add(array[i-1]);
					maxCount = count;
					count = 1;
				}else if(count== maxCount) {
					answerList.add(array[i-1]);
					count = 1;
				}else {
					count = 1;
				}
			}
			if(i == n-1) {
				if(count> maxCount) {
					answerList.clear();
					answerList.add(array[i]);
				}else if(count== maxCount) {
					answerList.add(array[i]);
				}
			}
		}


		for(String answer :answerList) {
			System.out.println(answer);
		}
	}

}