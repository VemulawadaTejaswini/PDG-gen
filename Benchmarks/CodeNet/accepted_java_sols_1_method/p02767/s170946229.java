import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] junin = new int[n];
		for(int i =0;i < n;i++) {
			junin[i] = sc.nextInt();
		}
		int answerKoho = 0;
		int answer = 0;
		for(int i = 1;i <= 100;i++) {
			for(int j =0;j < n;j++) {
				answerKoho += (junin[j] -i) * (junin[j] -i);
			}
			if(answerKoho < answer) {
				answer = answerKoho;
			}
			if(i ==1) {
				answer = answerKoho;
			}
			answerKoho = 0;
		}
		System.out.println(answer);
	}
}