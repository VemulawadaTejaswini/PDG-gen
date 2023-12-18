import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.IntStream;

public class Main{

	public static void main(String[] args) {
		try (Scanner scTmp = new Scanner(System.in);) {

			int iCount = scTmp.nextInt();

			int iTmp[] = new int[iCount];

			IntStream.rangeClosed(0, iCount - 1).forEach(i -> iTmp[i] = scTmp.nextInt());
	
			int iAve = (int) Math.round(Arrays.stream(iTmp).average().getAsDouble());

			System.out.println(Arrays.stream(iTmp).map(i -> (iAve - i) * (iAve - i)).sum());

		}
	}
}