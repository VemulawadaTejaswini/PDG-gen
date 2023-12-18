import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		

		while(true){
			line = br.readLine();
			int num = Integer.valueOf(line);
			if(num == 0){
				break;
			}

			line = br.readLine();
			String[] nums = line.split(" ");
			boolean NA = true;
			int zeros = 0;
			for(int i = 0; i < num; i++){
				int k = Integer.valueOf(nums[i]);
				if(k == 0){
					zeros++;
					continue;
				}
				if(k >= 2){
					NA = false;
					continue;
				}
			}
			if(NA){
				System.out.println("NA");
			}else{
				System.out.println(num + 1 - zeros);
			}
		}
	}

}