import java.io.BufferedReader;
//import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws IOException {
		//System.setIn(new FileInputStream("./input.txt"));
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String l;
		while((l = br.readLine()) != null){
			int[] a = Arrays.stream(l.split(" ")).mapToInt(Integer::parseInt).toArray();
			int s = a[0] + a[1];
			System.out.println(String.valueOf(s).length());
			/*for(int i = 0; i < 14; ++i) {
				s /= 10;
				if(s == 0){
					System.out.println(i+1);
					break;
				}
						
			}*/
		}

	}

}