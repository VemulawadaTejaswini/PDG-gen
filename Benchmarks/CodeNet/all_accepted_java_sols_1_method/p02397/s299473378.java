import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true) {
			
			String datas = br.readLine();
			String[] data = datas.split(" ");
			int x = Integer.parseInt(data[0]);
			int y = Integer.parseInt(data[1]);
			
			if(x==0&&y==0) {
				break;
			}
			
			if(x<y) {
				System.out.println(x+" "+y);
			}else {
				System.out.println(y+" "+x);
			}
			
		}
		
	}
}