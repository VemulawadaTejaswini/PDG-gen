
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		List<Integer> answerList = new ArrayList();
		
		for(int i = 1; i <= n; i++) {
			int number = i;
			int count = 0;
			while(number >= 10) {
				number /= 10;
				count ++;
			}
			if(count == 0 || count % 2 == 0) {
				answerList.add(i);
			}
		}
		System.out.println(answerList.size());
		
		


		

		
		

		
		
	}	

}

