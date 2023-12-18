import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		while(true){
			int m = scan.nextInt();
			if(m == 0){
				break;
			}
			int d = scan.nextInt();
			
			int[] day = new int[12];
			day[0] = 3;
			day[1] = 6;
			day[2] = 0;
			day[3] = 3;
			day[4] = 5;
			day[5] = 1;
			day[6] = 3;
			day[7] = 6;
			day[8] = 2;
			day[9] = 4;
			day[10] = 0;
			day[11] = 2;
			String[] month = new String[7];
			month[0] = "Monday";
			month[1] = "Tuesday";
			month[2] = "Wednesday";
			month[3] = "Thursday";
			month[4] = "Friday";
			month[5] = "Saturday";
			month[6] = "Sunday";
			System.out.println(month[(d-1+day[m-1])%7]);
		}
	}
}