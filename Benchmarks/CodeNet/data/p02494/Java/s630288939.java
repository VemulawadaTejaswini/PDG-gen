import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) {
		print();
	}

	public static void print() {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			StringBuilder sb =new StringBuilder();
			String str = br.readLine();
			while (str != null) {
				String[] nums = str.split(" ", 0);
				int height = Integer.parseInt(nums[0]);
				int width = Integer.parseInt(nums[1]);

				if(height == 0 && width == 0){
					break;
				}

				for(int i = 0; i < width; i ++){
					sb.append("#");
				}
				for(int i = 0; i < height; i++){
					System.out.println(sb);
				}
				System.out.println("");
				str = br.readLine();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}