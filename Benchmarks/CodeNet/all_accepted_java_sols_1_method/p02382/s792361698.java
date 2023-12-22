import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int num = Integer.parseInt(br.readLine());

		String[] vectorX = br.readLine().split(" ");
		String[] vectorY = br.readLine().split(" ");

		int[] vectorElement = new int[num];
		for(int i = 0; i < num;i++){
			int convertX = Integer.parseInt(vectorX[i]);
			int convertY = Integer.parseInt(vectorY[i]);

			vectorElement[i] =Math.abs(convertX - convertY);
		}

		double distanceP1 = 0;
		for(int i = 0; i < num;i++){
			distanceP1 += vectorElement[i];
		}
		System.out.printf("%.6f\n", distanceP1);

		double distanceP2 = 0;
		for(int i = 0; i < num;i++){
			double power2Abs = Math.abs(vectorElement[i] * vectorElement[i]);
			distanceP2 += power2Abs;
		}
		double distanceP2Sqrt = Math.sqrt(distanceP2);
		System.out.printf("%.6f\n", distanceP2Sqrt);

		double distanceP3 = 0;
		for(int i = 0; i < num;i++){
			double power3Abs = Math.abs(vectorElement[i] * vectorElement[i] * vectorElement[i]);
			distanceP3 += power3Abs;
		}
		double distanceP3Cbrt = Math.cbrt(distanceP3);
		System.out.printf("%.6f\n", distanceP3Cbrt);

		double max = vectorElement[0];
		for(int i = 1;i < num - 1;i++){
			max = Math.max(max, vectorElement[i]);
		}
		System.out.printf("%.6f\n", max);

		br.close();
	}
}