
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String line="";
		int[] months = {31,29,31,30,31,30,31,31,30,31,30,31};
		while(!(line = br.readLine()).equals("0 0")){
			String[] s =line.split(" ");
			int month = Integer.parseInt(s[0]);
			int day = Integer.parseInt(s[1]);
			int sum = 0;
			for(int i = 1; i<month;i++){
				sum+=months[i-1];
			}
			sum += day;
			switch(sum%7){
			case 0:
				System.out.println("Wednesday");
				break;
			case 1:
				System.out.println("Thursday");
				break;
			case 2:
				System.out.println("Friday");
				break;
			case 3:
				System.out.println("Saturday");
				break;
			case 4:
				System.out.println("Sunday");
				break;
			case 5:
				System.out.println("Monday");
				break;
			case 6:
				System.out.println("Tuesday");
				break;
			}
		}

	}

}