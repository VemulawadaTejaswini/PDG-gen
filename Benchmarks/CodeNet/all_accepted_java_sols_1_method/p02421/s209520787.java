import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int point1 = 0, point2 = 0;
		String animal1, animal2;
		for (int i = 0; i < n; i++) {
			animal1 = sc.next();
			animal2 = sc.next();
			char[] array1 = animal1.toCharArray();
			char[] array2 = animal2.toCharArray();
			int arrayLength = Math.min(array1.length, array2.length);
			top: for (int j = 0; j < arrayLength; j++) {
				if (array1[j] > array2[j]) {
					point1 += 3;
					break top;
				} else if (array1[j] < array2[j]) {
					point2 += 3;
					break top;
				} else if (j == arrayLength - 1) {
					if (array1.length == array2.length) {
						point1 += 1;
						point2 += 1;
						break top;
					} else if (array1.length > array2.length) {
						point1 += 3;
						break top;
					} else {
						point2 += 3;
						break top;
					}
				}
			}
		}
		System.out.println(point1 + " " + point2);
		sc.close();
	}
}
