
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String str;
		String[] arrStr;
		try {
			// 1 line
			str = br.readLine();
			int[] arr = new int[Integer.parseInt(str)];

			// 2 line
			str = br.readLine();
			arrStr = str.split(" ");

			for(int i=0;i<arrStr.length;i++){
				arr[i] = Integer.parseInt(arrStr[i]);
			}

			int min = Integer.MAX_VALUE;
			int max = Integer.MIN_VALUE;
			long sum = 0;
			for(int num :arr){
				min = min > num ? num : min;
				max = max < num ? num : max;
				sum += num;
			}

			System.out.println(min + " " + max + " " + sum);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}