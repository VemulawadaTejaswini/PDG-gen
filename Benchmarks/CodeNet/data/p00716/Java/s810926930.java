import java.util.Scanner;

public class Main{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int data = sc.nextInt();

		for(int j=0; j<data; j++){
			int max = 0;
			int before = sc.nextInt();
			int year = sc.nextInt();
			int type_num = sc.nextInt();
			for(int i=0; i<type_num; i++){
				int type = sc.nextInt();
				double rate = sc.nextDouble();
				int fee = sc.nextInt();
				int after = 0;
				switch(type){
					case 0:
					after = Simple_interest(before, year, rate, fee);
					break;
					case 1:
					after = Compound_interest(before, year, rate, fee);
					break;
				}
				if(max < after) max = after;
			}
			System.out.println(max);
		}
	}

	public static int Simple_interest(int before, int year, double rate, int fee){
		int fortune = before, interest = 0;

		for(int i=0; i<year; i++){
			interest += fortune*rate;
			fortune -= fee;
		}

		return fortune+interest;
	}

	public static int Compound_interest(int before, int year, double rate, int fee){
		int fortune = before, interest = 0;

		for(int i=0; i<year; i++){
			interest += fortune*rate;
			fortune = fortune + interest - fee;
			interest = 0;
		}

		return fortune;
	}
}