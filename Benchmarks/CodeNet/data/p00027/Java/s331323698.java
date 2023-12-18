import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		

		Scanner sc = new Scanner(System.in);
		String[] days={"Thursday","Friday","Saturday","Sunday","Monday","Tuesday","Wednesday"};
		while(sc.hasNextInt()){
			int month=sc.nextInt();
			int day=sc.nextInt();
			int a=modd(month);
			int b=a+day;
			if(month==0){
				break;
			}
			if((b-1)%7==0){
				System.out.println(days[0]);
		}else if((b-1)%7==1){
			System.out.println(days[1]);
		}else if((b-1)%7==2){
			System.out.println(days[2]);
		}else if((b-1)%7==3){
			System.out.println(days[3]);
		}else if((b-1)%7==4){
			System.out.println(days[4]);
		}else if((b-1)%7==5){
			System.out.println(days[5]);
		}else if((b-1)%7==6){
			System.out.println(days[6]);
		}
	}

	}
	public static int modd(int month){
		int[] months={31,29,31,30,31,30,31,31,30,31,30,31};
		int a=0;
		for(int i=0; i<=month-2; i++){
			a+=months[i];
		}

		return a;
	}
















}