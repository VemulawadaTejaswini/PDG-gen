import java.math.BigDecimal;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try(Scanner scanner = new Scanner(System.in)) {
			String data1 = scanner.nextLine();
			String data2 = scanner.nextLine();
			String data3 = scanner.nextLine();

			String[] data1Array = data1.split(" ");
			String[] data2Array = data2.split(" ");

			BigDecimal startPosA = new BigDecimal(data1Array[0]);
			BigDecimal moveDisA = new BigDecimal(data1Array[1]);
			BigDecimal startPosB = new BigDecimal(data2Array[0]);
			BigDecimal moveDisB = new BigDecimal(data2Array[1]);
			long time = Long.parseLong(data3);

			boolean isCatch = false;
			for (long i = 1; i <= time; i++) {
				startPosA = startPosA.add(moveDisA);
				startPosB = startPosB.add(moveDisB);

				if (startPosA.compareTo(startPosB) >= 0) {
					isCatch = true;
					break;
				}
			}

			System.out.println(isCatch ? "YES" : "NO");
		}
	}
}