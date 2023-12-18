
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static final int[] NUM_DAYS= {
		31,
		29,
		31,
		30,
		31,
		30,
		31,
		31,
		30,
		31,
		30,
		31
	};
	
	public static void main(String[] args) {
		ArrayList<String> result = new ArrayList<String>();
		Scanner sc = new Scanner(System.in);
		while(true){
			//ツ個篠禿コツづーツ偲ウツつッツ偲ヲツづゥ
			int month = sc.nextInt();
			int day = sc.nextInt();
			if(month == 0){
				break;
			}
			
			//ツ禿シツ療債個篠禿コツづ慊づづ個禿コツ青板づーツ仰づ淞づゥ
			int days = 0;
			for(int i = 1; i < month; i++){
				days += NUM_DAYS[i - 1];
			}
			days += day;
			
			//ツ曜ツ禿コツづーツ算ツ出ツつオツ個仰嘉環δ環スツトツづ可津嘉つキツづゥ
			int date = days % 7;
			switch(date){
			case 0:
				result.add("Wednesday");
				break;
			case 1:
				result.add("Thursday");
				break;
			case 2:
				result.add("Friday");
				break;
			case 3:
				result.add("Saturday");
				break;
			case 4:
				result.add("Sunday");
				break;
			case 5:
				result.add("Monday");
				break;
			case 6:
				result.add("Tuesday");
				break;
			}
		}
		
		for(int i = 0; i < result.size(); i++){
			System.out.println(result.get(i));
		}
	}
}