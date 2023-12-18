
import java.util.Scanner;

public class Main {
	public static void main(String[] args){
		Scanner stdIn = new Scanner(System.in);
		
		while(true){
			int m = stdIn.nextInt();
			int d = stdIn.nextInt();
			
			if(m==0 && d==0){
				break;
			}
			int count = d;
			for(int i=1;i<m;i++){
				if(i==2){
					count += 29;
				}
				else if(i==4 || i==6 || i==9 || i==11){
					count += 30;
				}
				else{
					count += 31;
				}
			}
			
			switch(count%7){
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