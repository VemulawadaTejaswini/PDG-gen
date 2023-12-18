import java.util.Scanner;

public class Main{
	private static Scanner scan;
	public static void main(String[] args) {
		scan = new Scanner(System.in);
		while(true){
			int m = scan.nextInt();
			int d = scan.nextInt();
			if(m == 0)break;
			int a = 3;
			for(int i = 1;i < m;i++){
				if(i == 2){
					a += 29;
				}else if(i == 4||i == 6||i == 9||i == 11){
					a += 30;
				}else{
					a+= 31;
				}				
			}
			a += d;
			int b = a % 7;
			switch(b){
			case 0:
				System.out.println("Sunday");
				break;
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			}
		}
		System.exit(0);
	}

}