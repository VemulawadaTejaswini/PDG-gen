import java.util.Scanner;

public class Main9 {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();
			String data3 = scanner.nextLine();

			String[] data1Array = data1.split(" ");
			String[] data2Array = data2.split(" ");

			long startPosA = Long.parseLong(data1Array[0]);
			long moveDisA = Long.parseLong(data1Array[1]);
			long startPosB = Long.parseLong(data2Array[0]);
			long moveDisB = Long.parseLong(data2Array[1]);
			long time = Long.parseLong(data3);

			boolean isCatch = false;
			for (int i = 1; i <= time; i++) {
				startPosA += moveDisA;
				startPosB += moveDisB;

				if (startPosA >= startPosB) {
					isCatch = true;
					break;
				}
			}

			System.out.println(isCatch ? "YES" : "NO");
		}
	}
}