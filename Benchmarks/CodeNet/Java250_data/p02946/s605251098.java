

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try {
			Scanner scanner = new Scanner(System.in);
			int k = scanner.nextInt();
			int x = scanner.nextInt();

			Main testB = new Main();
			ArrayList<Integer> answer = testB.oneClue(k, x);
			for (int i = 0; i < answer.size(); i++) {
				System.out.print(answer.get(i)+ " ");
			}
			scanner.close();

		} catch (InputMismatchException e) {
			// TODO: handle exception
			System.out.println("整数を入力してください");
		}
	}


	public ArrayList<Integer> oneClue(int k, int x) {
		ArrayList<Integer> answer = new ArrayList<>();
		for(int i = x-k+1; i <= x+k-1; i++) {
			if(i >= -1000000 && i <= 1000000) {
				answer.add(i);
			}
		}

		return answer;
	}

}

