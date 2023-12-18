import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			long n = Long.parseLong(br.readLine());
			long newNumber = n;
			
			if(n == 0){
				break;
			}
			
			int[] digits = new int[10];
			int i = 9;
			while(n > 0){
				digits[i] = (int)(n % 8);
				if(digits[i] >= 4){
					digits[i]++;
				}
				if(digits[i] >= 6){
					digits[i]++;
				}
				n /= 8;
				i--;
			}
			
			boolean start = false;
			for(i = 0; i < 10 ; i++){
				if(!start && digits[i] != 0){
					start = true;
				}
				if(start){
					System.out.print(digits[i]);
				}
			}
			System.out.println();
		}
	}

}