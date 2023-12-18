import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String datas = br.readLine();
		String[] data = datas.split(" ");
		int x = Integer.parseInt(data[0]);
		int y = Integer.parseInt(data[1]);
		int z = Integer.parseInt(data[2]);
		
		int count = 0;
		for(int i = x;i<y;i++) {
			
			if(z%i==0) {
				count++;
			}
			
		}
		
		System.out.println(count);
	}
}