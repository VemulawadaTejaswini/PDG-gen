import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		while(true){
			String tmpStr = br.readLine();

			if(tmpStr == null){
				break;
			}
			
			double inputV = Double.parseDouble(tmpStr);
			for(int i = 1;  ; i++){
				int height = i * 5 - 5;
				double v = Math.sqrt(2*9.8*height);
				//System.out.println(v);
				if(v >= inputV){
					System.out.println(i);
					break;
				}
				if(v > 200){
					break;
				}
			}
		}
	}

}