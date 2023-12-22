import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int N = Integer.valueOf(scn.nextLine()).intValue();
		String line2[] = scn.nextLine().split(" ");
		int H[] = new int[N];
		for(int i = 0;i < N;i++) {
			H[i] = Integer.valueOf(line2[i]).intValue();
		}

		// 一番西は絶対海が見えるから
		int countOceanViewHotels = 1;
		// 一番でかいホテルを記録していく
		int biggestHotelsHigh = H[0];
		for(int i = 1;i < N;i++) {
			if(H[i] >= biggestHotelsHigh) {
				countOceanViewHotels++;
				biggestHotelsHigh = H[i];
			}
		}

		System.out.println(countOceanViewHotels);
	}
}
