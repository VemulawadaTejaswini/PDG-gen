import java.io.*;
import java.util.Arrays;
public class Main {

	public static void main (String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		int set = Integer.parseInt(br.readLine());
					
		for(int i = 0; i < set; i++) {
			line = br.readLine();
			String[] numbers = line.split(" ");
			int[] numSet = new int[3];

			for (int j = 0; j < 3; j++){
				numSet[j] = Integer.parseInt(numbers[j]);
			}

			Arrays.sort(numSet);

			if(numSet[2]*numSet[2] == numSet[1]*numSet[1] + numSet[0]*numSet[0]){
				System.out.println("YES");
			}else{
				System.out.println("NO");
			}
		}
	}
}