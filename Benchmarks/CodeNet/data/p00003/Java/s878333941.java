import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
		String[] strTemp;
		int numberOfTriangle, data1, data2, data3;
		/*
		 * Count total of Triangles
		 */
		numberOfTriangle = Integer.parseInt(in.readLine());
		Triangle[] triangles = new Triangle[numberOfTriangle];

		/*
		 * Create all of Triangles
		 */
		for (int i = 0; i < numberOfTriangle; i++) {
			strTemp = in.readLine().split(" ");
			data1 = Integer.parseInt(strTemp[0]);
			data2 = Integer.parseInt(strTemp[1]);
			data3 = Integer.parseInt(strTemp[2]);
			triangles[i] = new Triangle(data1, data2, data3);
		}

		for (int j = 0; j < triangles.length; j++) {
			if (triangles[j].check()) {
				System.out.println("YES");
			} else {
				System.out.println("NO");
			}
		}
	}
}

class Triangle {
	private int id, data1, data2, data3, count;
	private Triangle[] triangles;

	/*
	 * instance
	 */
	public Triangle(int data1, int data2, int data3) {
		this.data1 = data1;
		this.data2 = data2;
		this.data3 = data3;
	}

	public boolean check() {
		int temp1, temp2, temp3;
		temp1 = (int) Math.pow(data1, 2);
		temp2 = (int) Math.pow(data2, 2);
		temp3 = (int) Math.pow(data3, 2);
		if (temp1 == temp2 + temp3 || temp2 == temp1 + temp3
				|| temp3 == temp1 + temp2) {
			return true;
		} else {
			return false;
		}
	}
}