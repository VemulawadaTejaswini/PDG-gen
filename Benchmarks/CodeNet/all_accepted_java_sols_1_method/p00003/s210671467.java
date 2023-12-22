import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int n = Integer.parseInt(br.readLine());
		
		//???????????\???
		for(int i = 0; i < n; i++){
			String[] tmpStr = br.readLine().split(" ");
			int[] lineLength = new int[3];
			int max = 0;
			int maxIndex = -1;
			
			for(int j = 0; j < 3; j++){
				lineLength[j] = Integer.parseInt(tmpStr[j]);
				if(lineLength[j] > max){
					max = lineLength[j];
					maxIndex = j;
				}
			}
			
			//??´?§?????§???¢?????§??????
			int sum = 0;
			for(int j = 0; j < 3; j++){
				
				int sq = lineLength[j] * lineLength[j];
				if(j == maxIndex){
					sum -= sq;
				}
				else {
					sum += sq;
				}
			}
			
			if(sum == 0){
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}