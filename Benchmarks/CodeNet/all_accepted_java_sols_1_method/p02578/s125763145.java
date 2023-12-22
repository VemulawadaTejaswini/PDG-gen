import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();
		int[] intArray = new int[num];

		for(int i = 0; i < num; i++)
		{
			intArray[i] = sc.nextInt();
		}

		long humidai = 0;
		int targetNum = 0;
		for(int i = 0; i < num; i++)
		{
			if(targetNum < intArray[i]) {
				targetNum = intArray[i];
				continue;
			}

			humidai += targetNum - intArray[i];
		}

		System.out.print(humidai);
	}
}