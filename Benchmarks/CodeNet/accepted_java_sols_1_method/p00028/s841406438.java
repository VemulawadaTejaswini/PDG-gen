import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main {
	public static void main(String[] args) {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int max = 0;
		int[] data = new int[100];
		try {
			while ((str = br.readLine()) != null) {
				data[Integer.parseInt(str) - 1]++;
			}
			
			for(int i = 0; i < 100; i++) {
				max = Math.max(data[i], max);
			}
			
			for(int i = 0; i < 100; i++) {
				if(max == data[i]) System.out.println(i+1);
			}
		} catch(IOException e) {
			e.printStackTrace();
		}
	}

}