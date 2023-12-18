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
			boolean flg = true;
			for(int i = 0; i < num; i++){
				if(num == 1 && Integer.valueOf(nums[i]) >= 2){
					System.out.println(2);
					flg = false;
					break;
				}
				if(Integer.valueOf(nums[i]) >= 2){
					System.out.println(num + 1);
					flg = false;
					break;
				}
			}
			if(flg){
				System.out.println("NA");	
			}
		}
	}

}