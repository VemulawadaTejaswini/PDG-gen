import java.util.Scanner;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int max;
		int min;
		int sum = 0;
		int ave = 0;
		int n = 0;
		int score;
		while(true) {
			n = sc.nextInt();
			if(n == 0){ break; }
			score = sc.nextInt();
			max = score;
			min = score;
			sum += score; 
			for(int i = 0 ; i < n-1; i++){
				score = sc.nextInt();
				if(score > max) {
					max = score;
				}
				if(score < min) {
					min = score;
				}
				sum += score; 	
			}
			sum = sum - max - min;
			ave = sum / (n-2);
			System.out.println(ave);
		}
		System.out.println("");
	}

}