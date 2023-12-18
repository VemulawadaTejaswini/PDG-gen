import java.util.Scanner;


public class Main {
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int sum_score=0,score;
		for(int i=0;i<5;i++){
			score = sc.nextInt();
			if(score<40){
				score = 40;
			}
			sum_score +=score;
		}
		System.out.println(sum_score/5);
	}
}