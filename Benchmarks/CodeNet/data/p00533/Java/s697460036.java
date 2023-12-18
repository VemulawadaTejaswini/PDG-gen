import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line;
		line = br.readLine();
		String[] nums = line.split(" ");
		int H = Integer.parseInt(nums[0]);
		int W = Integer.parseInt(nums[1]);
		
		for(int i = 0; i < H; i++){
			line = br.readLine();
			String[] chars = line.split("");
			for(int j = 0; j < W; j++){
				System.out.print(getNum(chars, j));
				if(j < W-1){
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	private static int getNum(String[] row, int num){
		for(int i = num; i >= 0; i--){
			if(row[i].equals("c")){
				return num - i;
			}	
		}
		return -1;
	}

}