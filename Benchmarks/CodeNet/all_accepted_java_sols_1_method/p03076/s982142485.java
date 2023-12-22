import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int[] input = new int[5];
		for(int i = 0; i < input.length ; i++) {
			input[i] = sc.nextInt();
		}


		int[] input2 = new int[5];
		for(int i = 0; i < input.length ; i++) {
			input2[i] = input[i] % 10;
		}

		int minNo = -1;
		int min = 10;
		for(int i = 0; i < input.length ; i++) {
			if(input2[i] < min && input2[i] != 0) {
				min = input2[i];
				minNo = i;
			}
		}

		int answer = 0;
		for(int i = 0; i < input.length ; i++) {
			if(i != minNo && input2[i] != 0) {
				input[i] = ((int)(input[i]/10) + 1)*10;
			}
			answer += input[i];
		}

		System.out.println(answer);
	}

}