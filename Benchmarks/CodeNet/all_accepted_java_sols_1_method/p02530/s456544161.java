import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int numData = 0;
		int pointA, pointB, temp;
		pointA = pointB = 0;
		StringBuffer[] data = new StringBuffer[2];
		for (int i = 0; i < 2; ++i)
			data[i] = new StringBuffer();
		try {
			numData = stdin.nextInt();
		} catch (Exception e) {
			e.printStackTrace();
			numData = 0;
		}

		for (int i = 0; i < numData; ++i) {
			try {
				for (int j = 0; j < 2; ++j) {
					data[j].delete(0, data[j].length());
					data[j].append(stdin.next());
				}
			} catch (Exception e) {
				e.printStackTrace();
			}
			temp = data[0].toString().compareToIgnoreCase(data[1].toString());
			if (temp < 0) {
				pointB += 3;
			} else if (temp > 0) {
				pointA += 3;
			} else {
				pointA += 1;
				pointB += 1;
			}
		}
		System.out.println(pointA + " " + pointB);
		stdin.close();
	}
}