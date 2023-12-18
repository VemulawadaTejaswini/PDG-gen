import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String[] s = sc.next().split("");
		int answer = 0;
		int answerKoho = 0;
		for(int i =0;i < s.length;i++) {
			if(s[i].equals("A")) {
				answerKoho++;
			}
			else if(s[i].equals("C")) {
				answerKoho++;
			}
			else if(s[i].equals("G")) {
				answerKoho++;
			}
			else if(s[i].equals("T")) {
				answerKoho++;
			}else {
				if(answerKoho > answer) {
					answer = answerKoho;
				}
				answerKoho = 0;
			}
			if(i == s.length-1) {
				if(answerKoho > answer) {
					answer = answerKoho;
				}
			}
		}
		System.out.println(answer);

	}
}