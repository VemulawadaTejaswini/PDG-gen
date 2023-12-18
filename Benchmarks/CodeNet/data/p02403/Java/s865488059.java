import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		StringBuffer sb = new StringBuffer();
		while(true){
			String [] str = bufferedReader.readLine().split(" ");
			Integer h = Integer.parseInt(str[0]);
			Integer k = Integer.parseInt(str[1]);
			if (h == 0 && k == 0)  {
				break;
			}
			
			for(int i  = 0; i < h; i++){
				for(int j = 0; j < k; j++){
					sb.append("#");
				}
				sb.append("\n");
			}
			sb.append("\n");
		}
		System.out.println(sb);
	}
}