import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			int num = Integer.parseInt(br.readLine());
			int calculationCount = 0;
			int[] intArr;
			boolean isEvenNumber = true;

			String[] stringArr = br.readLine().split(" ");
			intArr = new int[num];

			for (int i = 0; i < num; i++) {
				intArr[i] = Integer.parseInt(stringArr[i]);
			}

			while (true) {
				for (int i = 0; i < num; i++) {
					if (intArr[i] % 2 == 0) {
						calculationCount++;
						intArr[i] = intArr[i] / 2;
					} else {
						isEvenNumber = false;
					}
				}
				if (!isEvenNumber) {
					break;
				}
			}

			System.out.println(calculationCount / num);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
