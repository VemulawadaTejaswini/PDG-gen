import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int score[] = new int[5];
		int average = 0;
		for(int i=0;i<5;i++){
			score[i] = sc.nextInt();
			if(score[i]<40) score[i] = 40;
			average += score[i];
		}
		average /= 5;
		System.out.println(average);
	}

}