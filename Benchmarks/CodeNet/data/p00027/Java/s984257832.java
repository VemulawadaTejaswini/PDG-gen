import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;
import java.util.HashMap;

public class Main{
	

	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String dayofWeek[] = {"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
		int days[] = {31,29,31,30,31,30,31,31,30,31,30,31};
		String input;
		while((input = br.readLine()) != null){
			String s[] = input.split(" ");
			int month = Integer.parseInt(s[0]);
			int day = Integer.parseInt(s[1]);
			
			if(month == 0 && day == 0){
				System.exit(0);
			}
			
			for(int i = 0;i <month -1;i++){
				day += days[i];
			}
			
			System.out.println(dayofWeek[(day-1)%7]);
		}
	}
}