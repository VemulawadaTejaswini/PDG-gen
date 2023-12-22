import java.util.Scanner;

class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		if (count <= 1000) {
			String[] triangles = new String[count];
			for (int j = 0; j < count; j++) {
				int side1 = sc.nextInt();
				int side2 = sc.nextInt();
				int side3 = sc.nextInt();
				if (side1 >= 1 && side1 <= 1000) {
					if (side2 >= 1 && side2 <= 1000) {
						if (side3 >= 1 && side3 <= 1000) {
							String result = isRightTriangle(side1, side2, side3);
							triangles[j] = result;
						}
					}
				}
			}
			for (int k = 0; k < count; k++) {
				System.out.println(triangles[k]);
			}
		}
	}

	private static String isRightTriangle(int s1, int s2, int s3) {
		String test = "NO";
		if ((s1 * s1) == (s2 * s2) + (s3 * s3)) {
			test = "YES";
		} else if ((s2 * s2) == (s1 * s1) + (s3 * s3)) {
			test = "YES";
		} else if ((s3 * s3) == (s1 * s1) + (s2 * s2)) {
			test = "YES";
		}
		return test;
	}
}