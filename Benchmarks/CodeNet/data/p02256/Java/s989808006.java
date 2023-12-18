import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
	private static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	
	public static void main(String[] args) throws Exception {
		int[] array = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
		
		int x = array[0];
		int y = array[1];
		
		System.out.println(resolve(x, y));
	}
	
	public static int resolve(int x, int y){
		int large = Math.max(x, y);
		int small = Math.min(x, y);
		
		int mod = large % small;
		int answer = 0;
		if(mod != 0){
			answer = resolve(small, mod);
		}else{
			answer = small;
		}
		
		return answer;
	}
	
}

