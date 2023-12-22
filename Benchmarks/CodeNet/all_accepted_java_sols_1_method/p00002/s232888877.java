import java.io.*;
import java.util.List;
import java.util.ArrayList;

public class Main{
	public static void main(String args[]){
		new Main();
	}

	public Main(){
		BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

		List<String> lines = new ArrayList<String>();
		try{
			String line;
			while((line = in.readLine()) != null){
				lines.add(line);
			}
		}catch(IOException err){
			err.printStackTrace();
		}

		for(int i=0; i<lines.size(); i++){
			String[] nums = lines.get(i).split(" ");
			int a = Integer.parseInt(nums[0]);
			int b = Integer.parseInt(nums[1]);
			int num = a + b;

			int digit = 0;
			while(num != 0){
				num = num / 10;
				digit++;
			}

			System.out.println(digit);
		}
	}
}