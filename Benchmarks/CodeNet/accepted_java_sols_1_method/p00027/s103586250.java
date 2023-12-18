import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO ?????????????????????????????????????????????
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		while(true){
			String tmp = br.readLine();
			String[] tmpArray = tmp.split(" ");
			int m = Integer.parseInt(tmpArray[0]);
			int n = Integer.parseInt(tmpArray[1]);
			
			if(m == 0 && n == 0){
				break;
			}
			
			int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
			
			int day = n;
			for(int i = 0 ; i < m - 1; i++){
				day += days[i];
			}
			
			String result;
			switch (day%7) {
			case 1 :
				result = "Thursday";
				break;
			case 2 :
				result = "Friday";
				break;
			case 3 :
				result = "Saturday";
				break;
			case 4 :
				result = "Sunday";
				break;
			case 5 :
				result = "Monday";
				break;
			case 6 :
				result = "Tuesday";
				break;
			default :
				result = "Wednesday";
				break;
				
			}
			
			System.out.println(result);
			
		}
	}

}