import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(
					System.in));
			String[] strArray;		
			long sum = 0;
			int num ,max, min;
			
			int n = Integer.parseInt(br.readLine());
			strArray = br.readLine().split("\\s");

			max = Integer.parseInt(strArray[0]);
			min = Integer.parseInt(strArray[0]);
			
			for (int i = 0; i < n; i++) {
				num = Integer.parseInt(strArray[i]);
				if (max < num) {
					max = num;
				} else if (min > num) {
					min = num;
				}
				sum += num;
			}
			br.close();
			System.out.println(min +" "+ max +" "+ sum);
		} catch (Exception e) {
			System.err.println(e);
		}
	}
}