import java.util.Scanner;

public class Main {
    public static void main(String[] args){
    	Scanner input = new Scanner(System.in);
    	int[] days = {31,29,31,30,31,30,31,31,30,31,30,31};
		while(true){
			int m = input.nextInt();
			int d = input.nextInt();
			if(m == 0 && d == 0)break;
			int sum = 0;
			for(int i = 0 ; i < m-1 ; i++){
				sum += days[i];
			}
			sum += d;
			sum--;
			sum %= 7;
			switch(sum){
			case 0:
				System.out.println("Thursday");
				break;
			case 1:
				System.out.println("Friday");
				break;
			case 2:
				System.out.println("Saturday");
				break;
			case 3:
				System.out.println("Sunday");
				break;
			case 4:
				System.out.println("Monday");
				break;
			case 5:
				System.out.println("Tuesday");
				break;
			case 6:
				System.out.println("Wednesday");
				break;
			}
		}
    }
}