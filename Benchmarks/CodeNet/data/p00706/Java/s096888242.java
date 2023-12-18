import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			int n = Integer.parseInt(br.readLine());
			
			if(n == 0){
				break;
			}
			
			String[] tmpArray = br.readLine().split(" ");
			
			int fieldW = Integer.parseInt(tmpArray[0]);
			int fieldH = Integer.parseInt(tmpArray[1]);
			
			boolean[][] persimmon = new boolean[fieldH+1][fieldW+1];
			for(int i = 0; i <= fieldH; i++){
				Arrays.fill(persimmon[i], false);
			}
			//init persimmon
			for(int i = 0; i < n; i++){
				tmpArray = br.readLine().split(" ");
				int x = Integer.parseInt(tmpArray[0]);
				int y = Integer.parseInt(tmpArray[1]);
				persimmon[y][x] = true;
			}
			tmpArray = br.readLine().split(" ");
			int estateW = Integer.parseInt(tmpArray[0]);
			int estateH = Integer.parseInt(tmpArray[1]);
			
			//??¨?????????????????????????????§?????£?????????
			int max = 0;
			for(int i = 1; i + estateH - 1<= fieldH ; i++){
				for(int j = 1; j + estateW - 1 <= fieldW ; j++){
					int sumOfPersimmon = 0;
					for(int k = i; k < i + estateH ; k++){
						for(int l = j; l < j + estateW ; l++){
							if(persimmon[k][l]){
								sumOfPersimmon++;
							}
						}
					}
					
					if(sumOfPersimmon > max){
						max = sumOfPersimmon;
					}
				}
			}
			System.out.println(max);
		}
	}

}