import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		if(n ==1) {
			System.out.println(0);
			return;
		}
		int answer = 0;
		int tmpAnswer = 0;
		int left = sc.nextInt();
		int right = 0;
		for(int i =1; i <n;i++) {
			right = sc.nextInt();
			if(left >= right) {
				tmpAnswer++;
			}else {
				if(answer < tmpAnswer) {
					answer = tmpAnswer;
				}
				tmpAnswer =0;
			}
			left = right;
			if(i == n-1) {
				if(answer < tmpAnswer) {
					answer = tmpAnswer;
				}
			}
		}
		System.out.println(answer);
	}
}