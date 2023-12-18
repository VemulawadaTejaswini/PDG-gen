import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

import sun.security.krb5.KdcComm;
import sun.tools.jar.resources.jar;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {

		int				value;
		BufferedReader	reader = new BufferedReader(new InputStreamReader(System.in));
		List<String>	listStrings = new ArrayList<String>();
		List<Integer>	listMaxIntegers = new ArrayList<Integer>();

		while((value = Integer.parseInt(reader.readLine())) != 0){
			listMaxIntegers.add(value);
			for(int i = 0; i < value; i++)	listStrings.add(reader.readLine());
		}

		value = 0;
		for(int max : listMaxIntegers){
			int sum = 0;
			int[][] list = new int[max][max];

			for(int i = value; i - value < max;i++){
				String[] 	split = listStrings.get(i).split(" ");
				int 		sumOf = 0;

				for(int j = 0; j < max; j++){
					sumOf += Integer.parseInt(split[j]);
					list[i - value][j] = Integer.parseInt(split[j]);
					System.out.printf("%5d", Integer.parseInt(split[j]));
				}

				System.out.printf("%5d\n", sumOf);
			}

			int[] listSum = new int[max];
			for(int j = 0; j < max; j++){
				int sumOf = 0;

				for(int k = 0; k < max; k++){
					sumOf += list[k][j];
				}

				System.out.printf("%5d", sumOf);
				listSum[j] = sumOf;
				sum+= sumOf;
			}

			System.out.printf("%5d\n", sum);

			value += max;
		}
	}
}