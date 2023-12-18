
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			String line = br.readLine();
			
			System.out.println(getGreatestCommonDivisor(line));
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private static int getGreatestCommonDivisor(String line) {
		
		String[] splitedArray = line.split(" ", 0);
		int x = Integer.valueOf(splitedArray[0]).intValue();
		int y = Integer.valueOf(splitedArray[1]).intValue();
		
		if(x < y) {
			swap(x, y);
		}
		
		while(x % y != 0) {
			int temp = x % y;
			x = y;
			y = temp;
		}
		
		return y;
	}

	private static void swap(int x, int y) {
		int temp = y;
		y = x;
		x = temp;
	}
}

