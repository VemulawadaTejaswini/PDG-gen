import static java.lang.Math.*;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
		String[] temp = br.readLine().split(" ");
		int[] data1 = new int[n];
		for(int i = 0;i < n;i++){
			data1[i] = Integer.parseInt(temp[i]);
		}
		temp = br.readLine().split(" ");
		int[] data2 = new int[n];
		for(int i = 0;i < n;i++){
			data2[i] = Integer.parseInt(temp[i]);
		}

		double dist1 = 0, dist2 = 0, dist3 = 0, distInf = 0;

		for(int i = 0;i < n;i++){
			int diff = abs(data1[i] - data2[i]);

			dist1 += diff;
			dist2 += diff * diff;
			dist3 += diff * diff * diff;
			distInf = (distInf < diff) ? diff : distInf;
		}

		dist2 = sqrt(dist2);
		dist3 = pow(dist3, 1.0/3.0);

		System.out.printf("%f%n", dist1);
		System.out.printf("%f%n", dist2);
		System.out.printf("%f%n", dist3);
		System.out.printf("%f%n", distInf);
	}

}