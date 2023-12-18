import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		int numOfTimes, count = 0;
		Numbers[] numbers;
		boolean checkResult;
		numOfTimes = Integer.parseInt(in.readLine());
		numbers = new Numbers[numOfTimes];
		for (int i = 0; i < numOfTimes; i++) {
			checkResult = false;
			numbers[i] = new Numbers();
			numbers[i].readNumber(in.readLine());
			checkResult = numbers[i].check();
			if (checkResult) {
				count++;
			}
		}
		System.out.println(count);
	}
}

class Numbers {
	int num;

	protected Numbers() {
	}

	protected boolean check() {
		if (num == 1) {
			return false;
		} else {
			for (int x = 2; x <= num; x++) {
				if (num % x == 0) {
					if (num != x) {
						break;
					} else if (num == x) {
						return true;
					}
				}
			}
		}
		return false;
	}

	protected Numbers(int num) {
		this.num = num;
	}

	protected void readNumber(String inputData) {
		num = Integer.parseInt(inputData);
	}
}