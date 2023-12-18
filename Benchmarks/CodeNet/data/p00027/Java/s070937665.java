import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Main{
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String str;
		int date[] = {0,31,29,31,30,31,30,31,31,30,31,30,31};

		while(!(str=br.readLine()).equals("0 0")){
			String strArray[] = str.split(" ");
			int month = Integer.parseInt(strArray[0]);
			int day = Integer.parseInt(strArray[1]);

			for(int i=0; i<month; i++){
				day += date[i];
			}

			switch (day%7) {
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
			default:
				System.out.println("Wednesday");
				break;
			}
		}
	}
}