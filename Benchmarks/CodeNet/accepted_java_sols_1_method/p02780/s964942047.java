import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String line = sc.nextLine();
		String[] temp = line.split(" ");

		int totalNumOfDice = Integer.parseInt(temp[0]);
		int selectNumOfDice = Integer.parseInt(temp[1]);

		line = sc.nextLine();
		temp = line.split(" ");
		double[] dices = new double[temp.length];
		for (int i = 0; i < temp.length; i++) {
			dices[i] = Integer.parseInt(temp[i]);
		}

		double[] kitaichiArray = new double[temp.length];
		for (int i = 0; i < temp.length; i++) {

			kitaichiArray[i] = (dices[i] + 1) / 2;

		}



		double maxSumKitaichi = 0;
		for (int i = 0; i < selectNumOfDice; i++) {
			maxSumKitaichi += kitaichiArray[i];
		}
		double currentSumKitaichi = maxSumKitaichi;
		for (int start = 1; start <= totalNumOfDice - selectNumOfDice; start++) {
			currentSumKitaichi += kitaichiArray[start + (selectNumOfDice - 1)];
			currentSumKitaichi -= kitaichiArray[start - 1];

			maxSumKitaichi = Math.max(currentSumKitaichi, maxSumKitaichi);
		}

		System.out.println(maxSumKitaichi);

		sc.close();
	}

}