import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String str = br.readLine();
			
			if(str == null){
				break;
			}
			
			String[] tmpArray = str.split(" ");
			
			int y = Integer.parseInt(tmpArray[0]);
			int m = Integer.parseInt(tmpArray[1]);
			int d = Integer.parseInt(tmpArray[2]);
			
			int ymd = y*10000 + m * 100 + d;
			
			if(ymd >= 19890108){
				System.out.printf("heisei %d %d %d\n", y - 1988, m, d);
			}

			else if(ymd >= 19261225){
				System.out.printf("showa %d %d %d\n", y - 1925, m, d);
			}

			else if(ymd >= 19120730){
				System.out.printf("taisho %d %d %d\n", y - 1911, m, d);
			}

			else if(ymd >= 18680908){
				System.out.printf("meiji %d %d %d\n", y - 1867, m, d);
			}
			else {
				System.out.printf("pre-meiji\n");
			}


		}
	}

}