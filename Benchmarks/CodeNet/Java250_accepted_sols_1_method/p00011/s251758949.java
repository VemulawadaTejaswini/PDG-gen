import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str = br.readLine();
		int verticalLines = Integer.parseInt(str);
		int[] num = new int[verticalLines];
		for (int i = 0; i < verticalLines; i++) {
			num[i] = i + 1;
		}
		str = br.readLine();
		int horizontalLines = Integer.parseInt(str);
		for (int j = 0; j < horizontalLines; j++) {
			str = br.readLine();
			String[] edge = str.split(",", 2);
			int startingPoint = Integer.parseInt(edge[0]);
			int destination = Integer.parseInt(edge[1]);
			int temporary = num[destination - 1];
			num[destination - 1] = num[startingPoint - 1];
			num[startingPoint - 1] = temporary;
		}
		for (int number : num) {
			System.out.println(number);
		}
	}
}