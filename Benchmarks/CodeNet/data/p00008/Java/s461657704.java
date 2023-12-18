import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				
		while(true){
			String tmpStr = br.readLine();
			
			if(tmpStr == null){
				break;
			}

			int answer = Integer.parseInt(tmpStr);
			int count = 0;
			for(int i = 0; i <= 9999; i++){
				int tmp = i/1000+(i%1000)/100+(i%100)/10+i%10;
				if(tmp == answer){
					count++;
				}
			}
			
			System.out.println(count);
		}
	}
}