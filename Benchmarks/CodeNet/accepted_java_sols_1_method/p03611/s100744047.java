import java.util.Scanner;

public class Main {

	public static void main(String[] args) {


		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] array = new int[100001];
		int answer =0;
		for(int i=0; i< n;i++) {
			array[sc.nextInt()]++;
		}
		for(int i =0; i <= 100000-2;i++) {
			int tmpAnswer = 0;
			tmpAnswer += array[i];
			tmpAnswer += array[i+1];
			tmpAnswer += array[i+2];
			if(answer < tmpAnswer) {
				answer = tmpAnswer;
			}
		}
		System.out.print(answer);
	}
}