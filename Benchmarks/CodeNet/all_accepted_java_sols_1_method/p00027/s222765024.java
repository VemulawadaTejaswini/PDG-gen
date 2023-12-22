import java.util.Scanner;

class Main{
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int[] month = new int[]{31,29,31,30,31,30,31,31,30,31,30,31};
		while(sc.hasNextInt()){
			int a = sc.nextInt();
			int b = sc.nextInt();
			if(a == 0 && b == 0)break;
			int day = 0;
			for(int i = 0; i < a; i++)
				day += month[i];
			day -= month[a-1];
			day += b;
			day = day % 7;
			switch(day){
			case 0: System.out.println("Wednesday");
				break;
			case 1: System.out.println("Thursday");
				break;
			case 2: System.out.println("Friday");
				break;
			case 3: System.out.println("Saturday");
				break;
			case 4: System.out.println("Sunday");
				break;
			case 5: System.out.println("Monday");
				break;
			case 6: System.out.println("Tuesday");
			}
		}
	}
}