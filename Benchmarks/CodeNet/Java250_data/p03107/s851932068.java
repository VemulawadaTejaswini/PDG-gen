

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner sc = new Scanner(System.in);
		String cubes = sc.nextLine();

		String cubeArray[] = cubes.split("");
		int arrayLength = cubeArray.length;
		int redCount = 0, blueCount = 0;
		for (String cube : cubeArray) {
			if (cube.equals("1")) {
				blueCount++;
			} else {
				redCount++;
			}
		}
		int remainderCubes = Math.abs(blueCount - redCount);
		System.out.println(arrayLength - remainderCubes);
	}

}
