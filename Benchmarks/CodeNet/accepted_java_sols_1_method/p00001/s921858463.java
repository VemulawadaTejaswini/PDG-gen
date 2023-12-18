import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

//public class Problem0001_ListOfTop3Hills {
public class Main {
	public static void main(String[] args) {
		try {
			BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
			
			int[] mountains = new int[10];
			int num = 0;
			while(num < 10){
				String line = reader.readLine();
			//	System.out.println(line);
				mountains[num] = Integer.parseInt(line);
				num++;
			}
			
			Arrays.sort(mountains);
			
			for(int i = 9; i > 6; i--) {
				System.out.println(mountains[i]);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}